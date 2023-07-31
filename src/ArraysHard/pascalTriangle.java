package ArraysHard;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static long ncrMethod(int n,int r){
        long res = 1;
        for(int i = 0; i<r; i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
    public static void method2(int n){
        long ans = 1;
        System.out.print(ans+" ");

        for(int i = 1; i < n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans + " ");
        }
    }

    public static List<Integer> generateRow(int r){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(ans);
        for(int i = 1; i<r; i++){
            ans = ans*(r-i);
            ans = ans/i;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> method3(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        long element = ncrMethod(r-1, c-1);
        System.out.println("(Method 1) The element at position (r,c) is: " + element);

        int n = 5;
        System.out.println("(Method 2) The elements of row 6 is: ");
        method2(n);

        System.out.println();
        System.out.println("(Method 3)");

        int n2 = 5;
        List<List<Integer>> ans = method3(n2);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
