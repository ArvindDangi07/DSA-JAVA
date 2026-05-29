package string_Parsing_Simulation;

public class Leetcode3300 {


        public int minElement(int[] nums) {
            int min = Integer.MAX_VALUE;

            for(int n : nums){
                int sum = 0;
                while(n!=0){
                    int d = n%10;
                    sum+=d;
                    n=n/10;


                }
                min = Math.min(sum,min);


            }


            return min;

        }
    public static void main(String[] args) {
            int [] nums = {10,12,13,14};
            Leetcode3300 leetcode = new Leetcode3300();
            System.out.println(leetcode.minElement(nums));
    }
}
