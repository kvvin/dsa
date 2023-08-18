package binarySearch;

public class basic {
        public static int search(int[] nums, int target) {
            int n = nums.length;
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
            return -1;
        }

        public static int recursiveMethod(int [] a, int target, int low, int high){
            if(low>high)
                return -1;
            int mid = (low+high)/2;
            if(a[mid] == target) return mid;
            else if(target>a[mid]){
                low = mid + 1;
                return recursiveMethod(a,target,low,high);
            }
            else {
                high = mid-1;
                return recursiveMethod(a,target,low,high);
            }
        }
    public static int search2(int[] nums, int target) {
        return recursiveMethod(nums, target,0, nums.length-1);
    }
    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(a,target));

        int[] a1 = {3, 4, 6, 7, 9, 12, 16, 17};
        int target1 = 6;
        System.out.println(search2(a1, target1));
    }
}
