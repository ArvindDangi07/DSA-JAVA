package recursion;

public class Fibonacci_Recu {

    public static int fibo(int n){
        if(n<=1){
            return n;

        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        int i = 4;

        System.out.println(fibo(i));
    }
}
