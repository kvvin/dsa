package Patterns;

import java.util.Scanner;

public class fourth {
        public static void nStarTriangle(int n) {
            // Write your code here
            for (int i = 0; i < n; i++) {
                // For printing the spaces before stars in each row
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                // For printing the stars in each row
                for (int j = 0; j < 2 * i + 1; j++) {

                    System.out.print("*");
                }

                // For printing the spaces after the stars in each row
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }


                // As soon as the stars for each iteration are printed, we move to the
                // next row and give a line break otherwise all stars
                // would get printed in 1 line.
                System.out.println();
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows and columns");
        int n = sc.nextInt();
        nStarTriangle(n);
    }
}
