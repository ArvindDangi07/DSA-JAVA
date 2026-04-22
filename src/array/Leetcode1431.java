package array;

import java.util.ArrayList;
import java.util.List;

// Q.1431. Kids With the Greatest Number of Candies

public class Leetcode1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        int max = 0;
        for(int candy : candies){
            max = Math.max(max , candy);
        }

        for(int i = 0 ; i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int [] candies = {1,2,3,4,5};
        Leetcode1431 leetcode1431 = new Leetcode1431();
        List<Boolean> result = leetcode1431.kidsWithCandies(candies, 3);
        System.out.println(result);

    }
}
