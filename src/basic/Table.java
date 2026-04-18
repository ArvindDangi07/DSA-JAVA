
// Q. Take a number as input and print the multiplication table for it.

package basic;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        printTable(num);
    }

    static void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+num+"="+(num*i));
        }

    }
}
