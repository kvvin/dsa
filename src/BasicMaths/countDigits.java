package BasicMaths;

import java.util.Scanner;

public class countDigits {
    public static int count(int n) {

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
            // time complexity = O(log10(n)) because the lopp is dividing a number by 10 for n times.
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int n = sc.nextInt();
        System.out.println("No.of digits = "+ count(n));

    }
}
