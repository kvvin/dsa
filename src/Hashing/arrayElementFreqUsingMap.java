package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class arrayElementFreqUsingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int k = arr[i];
            int f = 0;
            if(map.containsKey(k))
                f = map.get(k);
            f++;
            map.put(k,f);
        }

        int q = sc.nextInt();
        while(q--!=0){
            int num = sc.nextInt();
            if(map.containsKey(num))
                System.out.println(map.get(num));
            else
                System.out.println(0);

        }
    }



}
