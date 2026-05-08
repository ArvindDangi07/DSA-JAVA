package array;

public class Leetcode3783 {

        public int mirrorDistance(int n) {

            int k = n;
            int rev=0;
            while(n!=0){
                int d = n%10;
                rev =(rev*10)+d;
                n=n/10;

            }
            int sub = Math.abs(k-rev);
            return sub;
        }
    public static void main(String[] args) {
            int n = 25;
            System.out.println(new Leetcode3783().mirrorDistance(n));
    }
}
