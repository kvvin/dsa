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

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = bruteForce(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
