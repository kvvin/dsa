package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergeSort {
    static void mergeSort(int [] arr, int low, int high){
        if( low >= high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left, right;
        left = low;
        right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<= high;i++){
            arr[i] = temp.get(i-low);

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0, high = n-1;
        mergeSort(arr, low, high);

        for (int i = 0 ;  i < n ; i ++){
            System.out.print(arr[i]+" ");
        }
    }


}
