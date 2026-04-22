package array;

import java.util.Arrays;

public class Leetcode167 {

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] res = new int[2];

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if (sum > target) {
                right--;
            }
            else {
                left++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        Leetcode167 leetcode167 = new Leetcode167();
        int[] res = leetcode167.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
