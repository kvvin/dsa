package ArraysHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeIntervals {

    public static List<List<Integer>> bruteForce(int[][]arr){
        int n = arr.length;
        Arrays.sort(arr, (o1, o2) -> o1[0]-o2[0]);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty()&& end<=ans.get(ans.size()-1).get(1))
                continue;
            for (int j = i+1; j<n; j++){
                if(arr[j][0]<=end){
                    end = Math.max(end,arr[j][1]);
                }
                else
                    break;
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = bruteForce(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();

    }
}
