
// Q.  Take name as input and print a greeting message for that particular name.

package basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        double p = sc.nextDouble();

        System.out.print("Enter interest rate : ");
        double r = sc.nextDouble();

        System.out.print("Enter time in months : ");
        int months = sc.nextInt();

        simpleInterest(p, r, months);
    }

    static void simpleInterest(double p, double r, int months) {

        double timeInYears = months / 12.0;

        double si = (p * r * timeInYears) / 100;

        System.out.println("Simple interest : " + si);
    }
}
