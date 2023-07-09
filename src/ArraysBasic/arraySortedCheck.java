package ArraysBasic;

import java.util.Scanner;

public class arraySortedCheck {
        public static int isSorted(int n, int []a) {
            // Write your code here.
            for(int i = 1; i<n; i++){

                if(a[i] >= a[i-1])
                {

                }

                else
                    return 0;

            }

            return 1;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(n,arr));
    }
    }

