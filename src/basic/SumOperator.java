
// Q.  Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use switch case)

package basic;

import java.util.Scanner;

public class SumOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int n = sc.nextInt();
        System.out.print("Enter second no. : ");
        int m = sc.nextInt();
        System.out.print("Enter a Operator : ");
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println("sum is: " + n + m);
            case "-" -> System.out.println("substraction is : " + (m - n));
            case "*" -> System.out.println("multiplication is : " + (n * m));
            case "/" -> System.out.println("division is : " + (n / m));
            default -> System.out.println("Invalid Operator");
        }
    }
}
