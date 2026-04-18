
// Q. Take two numbers and print the sum of both.

package basic;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();

        System.out.println("The sum is : " + sum(a,b));
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
