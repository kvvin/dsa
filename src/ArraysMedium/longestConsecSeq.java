package ArraysMedium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecSeq {
    //TC = O(N*lof(N))
    public static int bruteForce(int[] arr){
        int n = arr.length;
        int ans = 1;
        int prev = arr[0];
        int curr = 1;

        Arrays.sort(arr);

        for(int i = 0; i<n;i++){
            if(arr[i] == prev+1){
                curr++;
            }
            else{
                curr = 1;
            }
            prev = arr[i];
            ans  = Math.max(ans,curr);
        }
        return ans;
    }
    public static int optimalAprroach(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            if (!hashSet.contains(num - 1)) {
                int curNum = num;
                int curStreak = 1;
                while (hashSet.contains(curNum + 1)) {
                    curNum += 1;
                    curStreak += 1;
                }
                longest = Math.max(longest, curStreak);

            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[]={100,200,1,2,3,4};
        int lon=bruteForce(arr);
        System.out.println("The longest consecutive sequence using brute force is "+lon);

        System.out.println();

        int nums[]={100,200,1,2,3,4};
        int lon2=optimalAprroach(nums);
        System.out.println("The longest consecutive sequence using optimal approach is "+lon2);

    }
}
