package search;

public class Leetcode26 {

    public int removeDuplicates(int[] nums) {
        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // total unique elements
    }
    public static  void main(String[] args) {
        int [] nums = {1,1,2,2,3,4,4,5};
        Leetcode26 leetcode26 = new Leetcode26();
        System.out.println(leetcode26.removeDuplicates(nums));
    }
}
