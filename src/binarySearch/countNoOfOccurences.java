package binarySearch;

public class countNoOfOccurences {

    public static int first(int[] arr, int n, int k){
        int start = 0, end = n-1, ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == k) {
                ans = mid;
                end = mid -1;
            }
            else if(k<arr[mid]){
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return ans;
    }

    public static int last(int[] arr, int n, int k) {
        int start = 0, end = n - 1, ans = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == k){
                ans = mid;
                start = mid+1;
            }
            else if(k<arr[mid]){
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return ans;
    }
    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = first(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = last(arr, n, k);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3};
        int n = 7, k = 3;
        int ans = count(arr, n, k);
        System.out.println("The number of occurrences is: " + ans);

    }
}
