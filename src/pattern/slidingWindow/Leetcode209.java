package pattern.slidingWindow;

public class Leetcode209 {

        public int minSubArrayLen(int target, int[] nums) {

            int left = 0;
            int sum = 0;
            int miniLength = Integer.MAX_VALUE;

            for (int right = 0; right < nums.length; right++) {

                sum += nums[right];

                while (sum >= target) {
                    miniLength = Math.min(miniLength, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
            }

            return miniLength == Integer.MAX_VALUE ? 0 : miniLength;

        }
    public static void main(String[] args) {
            int [] nums = {2,3,1,2,4,3};
            int target = 7;
            Leetcode209 obj=new Leetcode209();
            System.out.println(obj.minSubArrayLen(target, nums));
    }
}
