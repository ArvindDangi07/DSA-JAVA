package pattern.slidingWindow;

public class Leetcode268 {


        public int missingNumber(int[] nums) {

            boolean[] seen = new boolean[nums.length+1];
            for( int n : nums ){

                seen[n]=true;

            }
            for(int i =0;i<nums.length;i++){

                if(!seen[i]){
                    return i;
                }
            }


            return nums.length ;

        }
    public static void main(String[] args) {
            int [] nums = {1,2,3,4,5};
            Leetcode268 leetcode268 = new Leetcode268();
            System.out.println(leetcode268.missingNumber(nums));
    }
}
