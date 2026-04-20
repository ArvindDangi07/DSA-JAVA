package loop;

// Q. Power In Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        System.out.print("enter no. of power : ");
        int power = sc.nextInt();

        System.out.println("The product of power is : "+ (Math.pow(number,power)));
    }
}
