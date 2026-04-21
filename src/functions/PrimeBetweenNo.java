package functions;

// Q. [Write a function that returns all prime numbers between two given numbers.]

import java.util.Scanner;

public class PrimeBetweenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of range : ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        checkPrime(s,e);
    }
    public static void checkPrime(int s, int e) {

        int count1 =0;

        for (int i = s ; i <= e; i++) {
            int count = 0;

            for ( int j = 1 ; j<=i;j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count == 2) {
                count1++;
                System.out.println(i);
            }
        }
        System.out.println("prime no. between " + s + " and " + e+" is : "+count1);

    }
}
