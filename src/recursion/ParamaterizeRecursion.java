package recursion;



public class ParamaterizeRecursion {

    public static void f1(int n , int sum){
        if(n<1){
            System.out.println(sum);
            return ;
        }
        f1(n-1,sum+n);

    }



    public static void main(String[] args) {
        int n = 3;
        int sum  = 0;

        f1(n,sum);
    }
}
