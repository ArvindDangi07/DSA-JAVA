package pattern.twoPointer;

import java.util.Arrays;

public class Leetcode977 {

        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            int left = 0;
            int right = n - 1;
            int pos = n - 1;

            while (left <= right) {
                int leftSq = nums[left] * nums[left];
                int rightSq = nums[right] * nums[right];

                if (leftSq > rightSq) {
                    result[pos] = leftSq;
                    left++;
                } else {
                    result[pos] = rightSq;
                    right--;
                }
                pos--;
            }

            return result;
        }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Leetcode977 leetcode977 = new Leetcode977();
        System.out.println(Arrays.toString(leetcode977.sortedSquares(nums)));
    }
}
