package loop;

// Q. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
import java.util.Scanner;

class Leetcode1281 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n=sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }
    static  int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;

        while(n!=0){
            int d = n%10;
            sum +=d;
            multi*=d;
            n=n/10 ;
        }
        return multi-sum;

    }
}