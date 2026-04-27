package array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {


        public List<Integer> findDisappearedNumbers(int[] nums) {

            boolean[] seen = new boolean[nums.length+1];

            for(int n : nums){
                seen[n]=true;
            }

            List<Integer> arr = new ArrayList<>();

            for(int i = 1;i<=nums.length;i++){
                if(!seen[i]){
                    arr.add(i);
                }
            }
            return arr;

        }


    public static  void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        Leetcode448 leetcode448 = new Leetcode448();
        System.out.println(leetcode448.findDisappearedNumbers(nums));
    }


}
