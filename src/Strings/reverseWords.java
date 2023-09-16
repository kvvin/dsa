package Strings;

import java.util.Scanner;

public class reverseWords {

    public static String rev(String s){
        String[] str = s.trim().split("\\s+");
        String ans = "";

        for(int i = str.length-1;i>0;i--){
            ans+=str[i]+" ";
        }
        return ans+str[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Input: "+s);
        System.out.println("Output: "+ rev(s));

    }
}
