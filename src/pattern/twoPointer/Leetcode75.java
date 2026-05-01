package pattern.twoPointer;


public class Leetcode75 {

        public void sortColors(int[] nums) {

            int low = 0;
            int high = nums.length-1;
            int mid = 0;



            while(mid<=high){
                if(nums[mid]==0){
                    int tem = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = tem;
                    low++;
                    mid++;
                }else if (nums[mid]==1){
                    mid++;
                }else if (nums[mid]==2){
                    int tem = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = tem;
                    high--;

                }
            }

        }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,1,0};

        Leetcode75 obj = new Leetcode75();
        obj.sortColors(nums);

        // print result
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
