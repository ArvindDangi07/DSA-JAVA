package functions;


// Q.


import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No. : ");
        int a = sc.nextInt();
        System.out.print("Enter second No. : ");
        int b = sc.nextInt();
        System.out.print("Enter third No. : ");
        int c = sc.nextInt();

        System.out.println("Maximum NO.  is : " + max(a,b,c));
        System.out.println("Minimum NO.  is : " + min(a,b,c));

    }
    static int max(int a, int b,int c) {
        int max = a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;

    }

    static int min(int a, int b,int c) {
        int min = a;

        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;

    }

//    static int max(int a, int b, int c) {
//        return Math.max(a, Math.max(b, c));
//    }
//
//    static int min(int a, int b, int c) {
//        return Math.min(a, Math.min(b, c));
//    }
}
