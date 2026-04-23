package array;

import java.util.Arrays;

public class Leetcode66 {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;   // simple increment
                return digits;
            }

            digits[i] = 0; // carry case
        }

        // if all digits were 9 → create new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int [] digits = new int [] {1,2,3,4,5,6,7,8,9,10};
        Leetcode66 leetcode66 = new Leetcode66();
        System.out.println(Arrays.toString(leetcode66.plusOne(digits)));
    }
}
