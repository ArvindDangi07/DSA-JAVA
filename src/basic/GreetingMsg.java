
// Q.  Take name as input and print a greeting message for that particular name.
package basic;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str = sc.nextLine();

        System.out.println("Good Morning "+ str);
    }
}
