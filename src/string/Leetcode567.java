package string;

public class Leetcode567 {



        public boolean checkInclusion(String s1,
                                      String s2) {

            if(s1.length() > s2.length()){
                return false;
            }

            int k = s1.length();

            int[] freq = new int[26];

            // frequency of s1
            for(char c : s1.toCharArray()){

                freq[c-'a']++;
            }

            // first window
            for(int i = 0; i < k; i++){

                freq[s2.charAt(i)-'a']--;
            }

            if(allZero(freq)){
                return true;
            }

            // sliding window
            for(int i = k; i < s2.length(); i++){

                // remove left
                freq[s2.charAt(i-k)-'a']++;

                // add right
                freq[s2.charAt(i)-'a']--;

                if(allZero(freq)){
                    return true;
                }
            }

            return false;
        }

        public boolean allZero(int[] freq){

            for(int num : freq){

                if(num != 0){
                    return false;
                }
            }

            return true;
        }
    public static void main(String[] args) {
            String s1 = "ab";
            String s2 = "avbnbajfe";
            Leetcode567 leetcode567 = new Leetcode567();
            System.out.println(leetcode567.checkInclusion(s1,s2));
    }
}
