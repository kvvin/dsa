package ArraysMedium;

public class majorityElement {
        public static int majorityElem(int[] nums) {
            int n = nums.length;
            int count = 0, el = 0;
            for(int i = 0; i<n; i++){
                if(count == 0){
                    el = nums[i];
                    count = 1;
                }
                else if(el == nums[i]){
                    count++;
                }
                else
                    count--;
            }
            int cnt1 = 0;
            for(int i = 0; i<n; i++){
                if(nums[i]==el)
                    cnt1++;
            }
            if(cnt1>(n/2)){
                return el;
            }
            else return -1;


        }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElem(nums);
        System.out.println("The majority element is: " + ans);
    }
    }
