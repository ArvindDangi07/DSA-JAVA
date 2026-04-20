

// Q. Calculate Electricity Bill

package loop;

import java.util.Scanner;

public class Electricity_Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter previous unit: ");
        double p = sc.nextDouble();

        System.out.print("Enter current unit: ");
        double c = sc.nextDouble();

        System.out.println("Total amount to pay: " + electricity(p, c));
    }

    public static double electricity(double p, double c) {

        double totalUnit = c - p; // FIXED
        double amount = 0;

        // slab calculation
        if (totalUnit <= 100) {
            amount = totalUnit * 5;
        } else if (totalUnit <= 200) {
            amount = (100 * 5) + (totalUnit - 100) * 7;
        } else {
            amount = (100 * 5) + (100 * 7) + (totalUnit - 200) * 10;
        }

        double fixedCharges = 50;
        double tax = amount * 0.05; // 5% tax

        return amount + fixedCharges + tax;
    }
}