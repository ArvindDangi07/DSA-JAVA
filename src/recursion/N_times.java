package recursion;

import java.util.Scanner;

public class N_times {
    static  int i = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        m3(i,n);
    }
    public static void m3(int i , int n){
        if(i>n){
            return;
        }
        System.out.println("Arvind Dangi");
        m3(i+1,n);
    }
}
