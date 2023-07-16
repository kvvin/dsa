package ArraysMedium;

public class sortColor {
    public static void sortColors(int[] nums) {
            int n = nums.length;
            int low = 0;
            int mid = 0;
            int high = n-1;
            int temp;
            while(mid<= high){
                if(nums[mid] == 0){
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }

            }
        }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};
        sortColors(nums);
        System.out.println("After sorting:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    }

