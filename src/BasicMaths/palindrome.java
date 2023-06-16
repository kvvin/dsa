package BasicMaths;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        // Write your code here
        int n, lastDigit, revNumber = 0, x;
        boolean isPalindrome;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x=n;
        while(n>0){
            lastDigit = n%10;
            revNumber = (revNumber*10) + lastDigit;
            n = n/10;
        }
        System.out.println(revNumber);
        if(x == revNumber)
        {
            isPalindrome = true;
        }
        else{
            isPalindrome = false;
        }
        System.out.println(isPalindrome);


    }
}