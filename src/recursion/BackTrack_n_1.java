package recursion;

import java.util.Scanner;

public class BackTrack_n_1 {
    static int i = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        m7(i,n);
    }
    public static void m7(int i,int n){
        if(i>n){
            return;
        }
        m7(i+1,n);
        System.out.println(i);
    }
}
