package binarySearch;

import java.util.Arrays;

public class firstAndLastPos {
        public static int[] searchRange(int[] nums, int target) {
            return new int[]{first(nums, target), last(nums, target)};
        }
        public static int last(int[] nums, int target){
            int n = nums.length;
            int start = 0, end = n-1, ans = -1;

            while(start<=end){
                int mid = start + (end - start) /2;
                if(nums[mid] == target){
                    ans = mid;
                    start = mid+1;
                }
                else if(target>nums[mid]){
                    start = mid + 1;
                }
                else
                    end = mid - 1;
            }
            return ans;

        }

        public static int first(int[] nums, int target)
        {
            int n = nums.length;
            int start = 0, end = n-1, ans = -1;

            while(start<=end){
                int mid = start + (end - start) /2;
                if(nums[mid] == target){
                    ans = mid;
                    end = mid-1;
                }
                else if(target>nums[mid]){
                    start = mid + 1;
                }
                else
                    end = mid - 1;
            }
            return ans;
        }

    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    }
