package ArraysMedium;

import java.util.Arrays;

public class setMatrixZero {
    public static int[][] bruteFore(int[][] arr, int n, int m){
        for(int i = 0; i< n; i++){
            for(int j = 0; j<m;j++){
                if(arr[i][j] == 0){
                    markRow(arr,i,m);
                    markCol(arr,j,n);
                }
            }
        }

        for(int i = 0; i<n ;i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static int[][] markRow(int[][]arr, int i,int m){
        for(int j = 0; j<m;j++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    public static int[][] markCol(int[][]arr, int j,int n){
        for(int i = 0; i<n;i++){
            if(arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
        return arr;
    }

    public static int[][] betterApproach(int[][]arr, int n , int m){
        int[]row = new int[n];
        int[]col = new int[m];

        for (int i = 0; i< n; i++){
            for(int j = 0; j< m ; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j< m;j++){
                if(row[i] == 1 ||col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static int[][] optimalApproach(int[][]arr, int n, int m){
        int col0 = 1;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;

                    if(j!=0){
                        arr[0][j]=0;
                    }
                    else
                        col0 = 0;
                }
            }
        }

        for(int i = 1; i< n; i++){
            for(int j = 1; j< m ; j++){
                if(arr[i][j]!=0){
                    {
                        if(arr[i][0]==0 || arr[0][j]==0){
                            arr[i][j] = 0;
                        }
                    }
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[][] arr ={
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        int n = arr.length;
        int m = arr[0].length;
        System.out.println(Arrays.deepToString(bruteFore(arr, n, m)));

        int[][] arr2 ={
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        int n1 = arr2.length;
        int m1 = arr2[0].length;
        System.out.println(Arrays.deepToString(betterApproach(arr2, n1, m1)));

        int[][] arr3 ={
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        int n2 = arr3.length;
        int m2 = arr3[0].length;
        System.out.println(Arrays.deepToString(betterApproach(arr3, n2, m2)));


    }
}
