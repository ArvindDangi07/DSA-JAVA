package pattern.slidingWindow;

public class Leetcode713 {

        public int numSubarrayProductLessThanK(int[] nums, int k) {

            if (k <= 1) return 0;   // edge case

            int count = 0;
            int product = 1;
            int left = 0;

            for (int right = 0; right < nums.length; right++) {

                product *= nums[right];  // expand window

                while (product >= k) {   // shrink window
                    product /= nums[left];
                    left++;
                }

                count += (right - left + 1);  // count subarrays
            }

            return count;
        }
    public static void main(String[] args) {
            int [] nums = {10,5,2,6};
            int k = 100;
            Leetcode713 obj=new Leetcode713();
            System.out.println(obj.numSubarrayProductLessThanK(nums, k));
    }
}
