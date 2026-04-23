package array;

import java.util.Arrays;

public class Leetcode1470 {

    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] ans = new int[m];

        for(int i = 0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        Leetcode1470 leetcode1470 = new Leetcode1470();

        System.out.println(Arrays.toString(leetcode1470.shuffle(nums, n)));
    }
}
