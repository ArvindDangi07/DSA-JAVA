package loop;

import java.util.Scanner;

// Q.  Take integer inputs till the user enters 0 and print the largest number from
//all.
public class InfiniteLargest {

    public static void main(String[] args) {
        System.out.println("Largest Number : "+Largest());

    }
    static  int Largest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int max =0;
          while(true){
             int n = sc.nextInt();
             if(n==0){
                 break;
             }
             if(n>max){
               max=n;
             }

          }
       return max;
    }
}
