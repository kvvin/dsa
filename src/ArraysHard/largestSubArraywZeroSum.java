package ArraysHard;

import java.util.HashMap;

public class largestSubArraywZeroSum {
    public static int max(int[] arr, int n){
        HashMap<Integer, Integer>mpp = new HashMap<>();
        int max = 0;
        int sum = 0;

        for (int i=0;i<n;i++){
            sum+=arr[i];
            if(sum == 0)
                max = i+1;
            if(mpp.get(sum) != null){
                max = Math.max(max,i-mpp.get(sum));
            }
            else
                mpp.put(sum, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {9, -3, 3, -1, 6, -5};
        int n = a.length;
        System.out.println(max(a,n));

    }
}
