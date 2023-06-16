package BasicMaths;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        // Write your code here
        int n, lastDigit,sum = 0, x;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x=n;
        int digit = (int)Math.log10(n)+1;
        while(n>0)
        {
            lastDigit = n%10;
            n = n/10;
            sum += Math.pow(lastDigit, digit);
        }
        System.out.println(sum);
        if(sum == x)
            System.out.println("true");
        else
            System.out.println("false");

    }
}