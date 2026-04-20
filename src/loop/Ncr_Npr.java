package loop;

// Q. Find Ncr & Npr

import java.util.Scanner;

public class Ncr_Npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("nPr is: " + nPrCalculate(n, r));
        System.out.println("nCr is: " + nCrCalculate(n, r));
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static long nPrCalculate(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static long nCrCalculate(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}