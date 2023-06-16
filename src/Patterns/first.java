package Patterns;

import java.util.Scanner;

public class first {

    public static void pattern(int n){
        int i,j;
        for(i=0;i<n;i++) {
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows and columns");
        int n = sc.nextInt();
        pattern(n);

    }
}
