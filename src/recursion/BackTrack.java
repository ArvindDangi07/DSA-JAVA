package recursion;

// 1 To n
import java.util.Scanner;

public class BackTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        m6(n,n);
    }
    public static void m6(int i,int n){
        if(i<1){
            return;
        }
        m6(i-1,n);
        System.out.println(i);
    }
}
