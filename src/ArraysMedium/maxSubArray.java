package ArraysMedium;

public class maxSubArray {
    public static int bruteForce(int[] nums) {
        //TC = O(N^3)
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }

    public static int betterApproach(int[] nums){
        //TC = O(N^2)
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int kadaneAlgo(int[] nums){
        //TC = O(N)
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            if((sum<0 && n==1) || (sum>0)){
                    max = sum;
                }
                else if(sum<0){
                    sum = 0;
                }
            }
            return max;
        }

    public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int maxSum = bruteForce(arr);
            System.out.println("The maximum subarray sum using brute force approach is: " + maxSum);
            int[] arr2 = {5,4,-1,7,8};
            int maxSum2 = betterApproach(arr2);
            System.out.println("The maximum subarray sum using better approach is: " + maxSum2);
            int[] arr3 = {-1};
            int maxSum3 = kadaneAlgo(arr3);
            System.out.println("The maximum subarray sum using Kadane algo is: " + maxSum3);

        }
    }
