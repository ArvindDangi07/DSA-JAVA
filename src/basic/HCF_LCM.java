
// Q. Take 2 numbers as inputs and find their HCF and LCM.

package basic;

import java.util.Scanner;

public class HCF_LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int min = Math.min(a, b);

        int hcf = 1;

        // Find HCF
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        // Find LCM using formula
        int lcm = (a * b) / hcf;

        System.out.println("HCF is: " + hcf);
        System.out.println("LCM is: " + lcm);

        sc.close();
    }
}