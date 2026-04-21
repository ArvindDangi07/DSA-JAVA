package array;

// Q. 1480. Running Sum of 1d Array

import java.util.Arrays;

public class Leetcode1480 {

    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans[i]=sum;

        }
        return ans;

    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        Leetcode1480 leetcode1480 = new Leetcode1480();
        int []result = leetcode1480.runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
