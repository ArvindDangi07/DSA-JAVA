package pattern.twoPointer;

public class Leetcode27 {

        public int removeElement(int[] nums, int val) {

            int k = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k;
        }

        public static void main(String[] args) {
            int[] nums= {3,2,2,3};
            int val=3;
            Leetcode27 leetcode27=new Leetcode27();
            System.out.println(leetcode27.removeElement(nums,val));
        }

}
