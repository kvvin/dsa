package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class highestAndLowestFreq {

    static void freq(int arr[],int n){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int max_freq = 0, min_freq = n, max_ele = 0, min_ele = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > max_freq){
                max_ele = element;
                max_freq = count;
            }
            if(count < max_freq) {
                min_ele = element;
                min_freq = count;
            }

        }
        System.out.println("Highest freq elem : " + max_ele);
        System.out.println("Lowest freq elem : " + min_ele);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        freq(arr,n);

    }
}
