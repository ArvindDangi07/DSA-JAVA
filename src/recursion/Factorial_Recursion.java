package recursion;

public class Factorial_Recursion {

    public static int f3(int n ){
        if(n==1){
            return 1;
        }
        return n*f3(n-1);
    }
    public static void main(String[] args) {
        int n  = 5;
        System.out.println(f3(n));
    }
}
