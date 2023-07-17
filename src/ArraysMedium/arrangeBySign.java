package ArraysMedium;

import java.util.ArrayList;

public class arrangeBySign {

    public static int[] bruteForce(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else
                pos.add(nums[i]);
        }

        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }
        return nums;
    }

    public static int[] optimalApproach(int[]nums){
        int n = nums.length;
        int posIndex = 0;
        int negIndex = 1;
        int[] ans = new int[n];

        for(int i = 0; i<n ;i++){
            if(nums[i]>0){
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
            else
            {
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int A[] = {1, 2, -4, -5};
        int[] ans = bruteForce(A);
        System.out.println("ans using brute force: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(ans[i] + " ");
        }

        int A2[] = {3,1,-2,-5,2,-4};
        int[] ans2 = optimalApproach(A2);
        System.out.println();
        System.out.println("ans using optimal method: ");
        for (int i = 0; i < A2.length; i++) {
            System.out.print(ans2[i] + " ");
        }
    }
}
