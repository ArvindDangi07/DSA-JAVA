package functions;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to check prime or not : ");
        int n = sc.nextInt();
        checkPrime(n);

    }
    static void checkPrime(int n){
        int count = 0;
        for(int i =1; i<=n; i++){
            if(n%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println("Prime NO.");
        }else {
            System.out.println("Not Prime NO.");
        }
    }
}
