package Recursion;

import java.util.Scanner;

public class printName1 {
    static void function(int i,int n){
        if(i>n)
            return;
        System.out.println("Kevin");
        i++;
        function(i,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(1,n);
    }
}
//TC = O(n)
//SC = O(n)
