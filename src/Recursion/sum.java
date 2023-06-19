package Recursion;

import java.util.Scanner;

public class sum {

    static void parameterisedFunction(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        parameterisedFunction(i-1,sum+i);
    }
    static int functional(int n){
        if(n==0)
            return 0;
        return n+functional(n-1);
    }
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*(factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parameterisedFunction(n,0);
        System.out.println("=========");
        System.out.println(functional(n));
        System.out.println("=========");
        System.out.println(factorial(n));

    }
}
