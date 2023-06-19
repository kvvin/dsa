package Recursion;

public class reverseArray {

    static void printArray(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[],int n){
        int p1 = 0, p2 = n-1;
        while(p1<p2){
            int tmp = arr[p1];
            arr[p1] = arr [p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        printArray(arr,n);

    }

    static void reverseArrayUsingSinglePtr(int i, int arr[],int n){
        if(i>=n/2)
            return;
        int tmp = arr[i];
        arr[i] = arr[n-i-1];
        arr[i] = tmp;
        i++;
        printArray(arr,n);
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        reverseArray(arr,n);
        System.out.println("----------");
        reverseArrayUsingSinglePtr(0,arr,5);

    }
}
