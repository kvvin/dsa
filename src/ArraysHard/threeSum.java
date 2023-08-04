package ArraysHard;

import java.util.*;

public class threeSum {

    public static List<List<Integer>> bruteForce(int n, int[] arr){
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0; i<n ; i++){
            for(int j = i+1; j<n;j++){
                for(int k = j+1; k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(st);
    }

    public static List<List<Integer>> betterApproach (int n, int [] arr){

        Set<List<Integer>>st = new HashSet<>();
        for(int i = 0; i<n-1; i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j = i+1; j<n-1;j++){
                int k = -(arr[i]+arr[j]);

                if(hashSet.contains(k)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], k);
                    temp.sort(null);
                    st.add(temp);
                }
                hashSet.add(arr[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static List<List<Integer>> optimalMethod(int n, int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i< n-1; i++){
            if(i!=0 && arr[i] == arr[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<0)
                    j++;
                else if(sum>0)
                    k--;
                else {
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while (j<k && arr[j]==arr[j-1])j++;
                    while (j<k && arr[k]==arr[k+1])k--;
                }
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = bruteForce(n, arr);
        System.out.println("Brute Force: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

        System.out.println("Better Approach: ");

        List<List<Integer>> ans2 = betterApproach(n, arr);
        for (List<Integer> it : ans2) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

        System.out.println("Optimal Approach: ");

        List<List<Integer>> ans3 = optimalMethod(n, arr);
        for (List<Integer> it : ans3) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
