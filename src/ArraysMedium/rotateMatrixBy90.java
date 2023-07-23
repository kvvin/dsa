package ArraysMedium;

import java.util.Arrays;

public class rotateMatrixBy90 {
    public static int[][] bruteForce(int[][]arr,int n, int m){
        int [][] ans = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ans[j][(n-1)-i] = arr[i][j];
            }
        }
        return ans;
    }

    public static int[][] optimalApproach(int[][]arr, int n, int m){
        for(int i = 0; i<n;i++){
            for(int j = i; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int m = arr[0].length;
        System.out.println(Arrays.deepToString(bruteForce(arr, n, m)));

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n1 = arr2.length;
        int m1 = arr2[0].length;
        System.out.println(Arrays.deepToString(bruteForce(arr2, n1, m1)));

    }
}
