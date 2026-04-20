package loop;

import java.util.Scanner;

// Q. Calculate Discount Of Product
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter net amount: ");
        double netAmount = sc.nextDouble();
        System.out.print("Enter applied discount % : ");
        double discountPercent = sc.nextDouble();

        productDiscount(netAmount, discountPercent);
    }
    static  void productDiscount(double netAmount , double discountPercent){
        double discount = netAmount * (discountPercent / 100);
        System.out.println("final amount to pay : "+ (netAmount - discount));
    }
}
