package array.matrix;

public class Leetcode2612 {


        public int diagonalPrime(int[][] nums) {
            int max = 0;
            int n = nums.length;

            for (int i = 0; i < n; i++) {

                // Primary diagonal
                if (isPrime(nums[i][i])) {
                    max = Math.max(max, nums[i][i]);
                }

                // Secondary diagonal
                if (isPrime(nums[i][n - 1 - i])) {
                    max = Math.max(max, nums[i][n - 1 - i]);
                }
            }

            return max;
        }

        // Optimized prime check
        private boolean isPrime(int num) {
            if (num <= 1) return false;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }

            return true;
        }
    public static void main(String[] args) {
            int [][] nums = {
                    {1,2,3},
                    {5,6,7},
                    {9,10,11}
            };
            Leetcode2612 leetcode2612 = new Leetcode2612();
            System.out.println(leetcode2612.diagonalPrime(nums));
    }
}
