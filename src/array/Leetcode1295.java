package array;

public class Leetcode1295 {


        public int findNumbers(int[] nums) {
            int count = 0;

            for(int i = 0; i < nums.length; i++){
                int num = nums[i]; // don't modify original
                int digits = 0;

                if(num == 0) digits = 1;

                while(num != 0){
                    digits++;
                    num /= 10;
                }

                if(digits % 2 == 0){
                    count++;
                }
            }

            return count;
        }
        public static void main(String[] args) {
            int[] arr = {123,34,4,6443,676};
            Leetcode1295 leetcode1295 = new Leetcode1295();
            System.out.println(leetcode1295.findNumbers(arr));
        }
    }

