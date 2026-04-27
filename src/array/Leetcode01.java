package array;

import java.util.Arrays;

public class Leetcode01 {


        public int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j =i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};

        }
        public static void main(String[] args) {
            int[] nums = {2,7,11,15};
            int target = 9;
            Leetcode01 leetcode01 = new Leetcode01();
            System.out.println(Arrays.toString(leetcode01.twoSum(nums,target)));
        }

}
