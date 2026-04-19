// Q.Input currency in rupees and output in USD.

package basic;

import java.util.Scanner;

public class USD_converter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double rate = 92.60;

        System.out.println("1.Rupees -> USD \n2.USD -> Rupees");
        System.out.print("Choose your choice: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("Enter amount in rupees : ");
            double rupees = sc.nextDouble();
            usdConverter(rupees, rate);

        } else if (n == 2) {
            System.out.print("Enter amount in dollar : ");
            double dollars = sc.nextDouble();
            rupeesConverter(dollars, rate);

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }

    static void usdConverter(double rupees, double rate) {
        double usd = rupees / rate;
        System.out.println("USD = " + usd);
    }

    static void rupeesConverter(double dollars, double rate) {
        double rupee = dollars * rate;
        System.out.println("Indian Rupees = " + rupee);
    }
}