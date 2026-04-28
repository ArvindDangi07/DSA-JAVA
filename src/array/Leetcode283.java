package array;

public class Leetcode283 {

        public void moveZeroes(int[] nums) {
            int left = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {

                    // swap nums[i] and nums[left]
                    int temp = nums[i];
                    nums[i] = nums[left];
                    nums[left] = temp;

                    left++;
                }
            }
        }
        public static void main(String[] args) {
            int[] nums1 = {0,1,0,3,12};
            Leetcode283 leetcode283 = new Leetcode283();
            leetcode283.moveZeroes(nums1);
        }

}
