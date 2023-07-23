package ArraysMedium;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    public static List printSpiral(int[][]a){
        int n = a.length;
        int m = a[0].length;

        List<Integer> ans = new ArrayList<>();
        int top = 0, left = 0, right = m-1, bot = n-1;

        while(top <= bot && left <= right){
            for(int i = left; i<= right; i++)
                ans.add(a[top][i]);
            top++;

            for(int i = top; i<= bot; i++)
                ans.add(a[i][right]);
            right--;

            if(top<=bot){
                for(int i = right; i>= left; i--)
                    ans.add(a[bot][i]);
                bot--;
            }

            if(left<=right){
                for(int i = bot; i>= top; i--){
                    ans.add(a[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
