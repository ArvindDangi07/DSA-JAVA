package array;

public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];  // better buying price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices = {1,2};
        Leetcode121 leetcode121 = new Leetcode121();
        System.out.println(leetcode121.maxProfit(prices));
    }
}
