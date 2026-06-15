package recursion;

public class InfiniteRecursion {

    public static void main(String[] args) {
         m1();

    }

    public  static void m1(){
        System.out.println("1");
        m1();
    }
}
