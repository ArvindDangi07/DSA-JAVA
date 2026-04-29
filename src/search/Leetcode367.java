package search;

public class Leetcode367 {

        public boolean isPerfectSquare(int num) {

            long low = 1;
            long high = num;

            while(low <= high){
                long mid = low + (high - low) / 2;
                long square = mid * mid;

                if(square == num){
                    return true;
                }
                else if(square < num){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            return false;
        }


/*


 public boolean isPerfectSquare(int num) {

        for(long i = 1; i * i <= num; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }











*/

    public static  void main(String[] args) {
        int num = 16;
        Leetcode367 leetcode367 = new Leetcode367();
        System.out.println(leetcode367.isPerfectSquare(9));
    }
}
