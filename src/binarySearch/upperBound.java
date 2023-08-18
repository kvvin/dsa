package binarySearch;

public class upperBound {
    public static int ub(int[] arr, int x){
        int low = 0, high = arr.length-1, ans = 0;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int x = 6;
        System.out.println(ub(arr,x));

    }
}
