
// Q. To find Armstrong Number between two given number.

package basic;

import java.util.Scanner;

public class ArmStrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int range1 = sc.nextInt();

        System.out.print("Enter end: ");
        int range2 = sc.nextInt();

        for (int i = range1; i <= range2; i++) {

            int original = i;
            int temp = i;
            int sum = 0;

            // count digits
            int digits = String.valueOf(i).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}