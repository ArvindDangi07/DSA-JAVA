package pattern.twoPointer;

import java.util.Arrays;

public class Leetcode3194 {

        public double minimumAverage(int[] nums) {

            Arrays.sort(nums);
            int left = 0;
            int right = nums.length-1;
            double min = Integer.MAX_VALUE;



            while(left<right){


                double averages = (nums[left]+nums[right])/2.0;
                min = Math.min(min,averages);
                left++;
                right--;


            }




            return min;

        }
    public static void main(String[] args) {
            int [] nums = {7,8,3,4,15,13,4,1};
            Leetcode3194 leetcode3194 = new Leetcode3194();
            System.out.println(leetcode3194.minimumAverage(nums));
    }
}
