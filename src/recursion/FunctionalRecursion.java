package recursion;

public class FunctionalRecursion {

    public static int f2( int n){
        if(n==0){
            return 0;
        }
        return n+f2(n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(f2(n));
    }
}
