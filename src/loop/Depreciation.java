
// Q. Calculate Depreciation of Value

package loop;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        System.out.print("Enter current amount: ");
        double currentAmount = sc.nextDouble();

        depreciationAmount(purchaseAmount, currentAmount);
    }

    static void depreciationAmount(double purchaseAmount, double currentAmount) {

        if (purchaseAmount <= 0) {
            System.out.println("Invalid purchase amount");
            return;
        }

        if (currentAmount > purchaseAmount) {
            System.out.println("No depreciation (value increased)");
            return;
        }

        double depreciationAmount = purchaseAmount - currentAmount;
        double percentage = (depreciationAmount / purchaseAmount) * 100;

        System.out.println("Depreciation amount: " + depreciationAmount);
        System.out.println("Depreciation %: " + percentage);
    }
}