package array;

import java.util.Arrays;

// Q. 1365. How Many Numbers Are Smaller Than the Current Number
public class Leetcode1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        for(int j = 0;j<n;j++){
            int count = 0;
            for(int i = 0;i<n;i++){
                if(nums[j]>nums[i]){
                    count++;
                }
            }
            ans[j]=count;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        Leetcode1365 leetcode1365 = new Leetcode1365();
        System.out.println(Arrays.toString(leetcode1365.smallerNumbersThanCurrent(nums)));
    }
}
