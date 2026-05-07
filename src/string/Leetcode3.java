package string;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {


        public int lengthOfLongestSubstring(String s) {

            Set<Character> set = new HashSet<>();

            int left = 0;
            int maxLength = 0;

            for(int i = 0;i<s.length();i++){

                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }

                set.add(s.charAt(i));
                maxLength=Math.max(maxLength,i-left+1);

            }

            return maxLength;



        }
        public static void main(String[] args) {
            String s = "abcabcbb";
            Leetcode3 leetcode3 = new Leetcode3();
            System.out.println(leetcode3.lengthOfLongestSubstring(s));
        }

}
