package BasicMaths;

import java.io.*;
import java.util.*;
public class revNumber {

    public static void main(String[] args) {
        // Write your code here
        int lastDigit, revNumber=0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N>0){
            lastDigit = N%10;
            revNumber = (revNumber*10) + lastDigit;
            N = N/10;
        }
        System.out.println(revNumber);

    }
}