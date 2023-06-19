package Recursion;

import java.util.Scanner;

public class linearNumberPrint {
    static void function(int i, int n){
        if(i>n)
            return;
        System.out.println(i);
        function(i+1,n);
    }
    static void backwardPrintFn(int i, int n){
        if(i<1)
            return;
        System.out.println(i);
        backwardPrintFn(i-1,n);
    }
    static void backtrack(int i, int n){
        if(i<1)
            return;
        backtrack(i-1,n);
        System.out.println(i);
    }
    static void backtrack2 (int i, int n){
        if(i>n)
            return;
        backtrack2(i+1,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(1,n);
        System.out.println("------------");
        backwardPrintFn(n,n);
        System.out.println("------------");
        backtrack(n,n);
        System.out.println("------------");
        backtrack2(1,n);
    }
}
