package sorting;

import java.util.Scanner;

public class selectionSort {

    static void sort(int arr[],int n){
        int temp = 0, i, j;
        for(i = 0; i <= n-2 ; i++){
            int min = i;
            for(j = i; j <= n-1; j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sort(arr,n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
