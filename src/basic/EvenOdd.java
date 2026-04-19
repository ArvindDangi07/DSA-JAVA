
// Q.  Write a program to print whether a number is even or odd, also take
//input from the user.

package basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();
        evenOdd(n);

    }

    static void evenOdd(int n){
        if(n%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }

}
