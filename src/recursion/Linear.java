package recursion;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        m4(1,n);
    }
    public static void m4(int i , int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        m4(i+1,n);
    }
}
