package pattern.slidingWindow;

import java.util.Arrays;

public class Leetcode1984 {


        public int minimumDifference(int[] nums, int k) {

            if(k==1){
                return 0;
            }

            Arrays.sort(nums);

            int min = Integer.MAX_VALUE;

            for(int i = 0;i<=nums.length-k;i++){
                int diff=nums[i+k-1]-nums[i];

                min=Math.min(min,diff);
            }

            return min;
        }
    public static void main(String[] args) {
            int [] nums = {9,4,2,3,5,6};
            int k=4;
            Leetcode1984 obj=new Leetcode1984();
            System.out.println(obj.minimumDifference(nums,k));
    }

}
