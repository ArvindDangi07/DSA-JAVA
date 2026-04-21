package functions;

// Q. Given a positive integer n, find the sum of the first n natural numbers.

import java.util.Scanner;

public class Sum_NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        sumOfNaturalNo(n);
    }
    public static void sumOfNaturalNo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println( "sum of natural no. : "+sum);
    }
}
