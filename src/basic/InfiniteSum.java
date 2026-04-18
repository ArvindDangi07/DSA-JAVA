
// Q. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

package basic;

import java.util.Scanner;

public class InfiniteSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (press 'x' to stop):");

        while (true) {
            String str = input.nextLine().trim();  // remove spaces

            // check exit condition (x or X)
            if (str.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int num = Integer.parseInt(str);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'x' to exit.");
            }
        }

        System.out.println("Total sum is: " + sum);
        input.close();
    }
}
