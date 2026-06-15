package recursion;

import java.util.Scanner;

public class BackTrackingPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        m5(1,n);
    }
    public static void m5(int i , int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        n--;
        m5(i,n);
    }
}
