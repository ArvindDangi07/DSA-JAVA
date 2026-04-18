
// Q. Input a year and find whether it is a leap year or not.


package basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year to check is leap year or not =>  ");
        int year = sc.nextInt();
        checkLeapYear(year);

    }

    static void checkLeapYear(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year"+"=>"+year);
        }
        else {
            System.out.println("Not Leap Year"+"=>"+year);
        }
    }
}
