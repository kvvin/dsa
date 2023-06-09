package sorting;

import java.util.Scanner;

public class bubbleSort {

    static void sort(int arr[],int n){
        for(int i = n-1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j <= i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap==0)
                break;
        }
    }

    static void recBubbleSort(int arr[], int n){
        if(n==1)
            return;
        int didSwap = 0;
        for(int j = 0 ; j<= n-2; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didSwap = 1;
            }
        }
        if (didSwap == 0) return;
        recBubbleSort(arr,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        /*sort(arr,n);

        System.out.println("The sorted array is: ");
        for(int i = 0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();*/

        recBubbleSort(arr,n);
        System.out.println("The sorted array using recursion is: ");
        for(int i = 0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
