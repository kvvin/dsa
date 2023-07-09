package ArraysBasic;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
        public static int secondLargest(int[] a, int n){
            int sLargest = -1;
            int largest = a[0];

            for(int i = 1; i<n; i++){
                if(a[i]>largest){
                    sLargest = largest;
                    largest = a[i];
                }
                else if(a[i] < largest && a[i] > sLargest)
                {
                    sLargest = a[i];
                }
            }
            return sLargest;
        }

        public static int secondSmallest(int[] a, int n){
            int sSmallest = Integer.MAX_VALUE;
            int smallest = a[0];

            for(int i = 1; i<n; i++){
                if(a[i]<smallest){
                    sSmallest = smallest;
                    smallest = a[i];
                }
                else if(a[i] != smallest && a[i]<sSmallest){
                    sSmallest = a[i];
                }
            }
            return sSmallest;
        }


        public static int[] getSecondOrderElements(int n, int []a) {
            // Write your code here.
            int sLargest = secondLargest(a, n);
            int sSmallest = secondSmallest(a, n);

            return new int[] {sLargest, sSmallest};


        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getSecondOrderElements(n,arr)));
    }
    }
