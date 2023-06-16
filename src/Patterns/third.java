package Patterns;

import java.util.Scanner;

public class third {
    public static void pattern(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
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
