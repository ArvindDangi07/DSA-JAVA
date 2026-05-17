package string;

public class Leetcode1456 {



        public int maxVowels(String s, int k) {

            int count = 0;

            // first window
            for(int i = 0; i < k; i++){

                if(checkVowels(s.charAt(i))){
                    count++;
                }
            }

            int max = count;

            // sliding window
            for(int i = k; i < s.length(); i++){

                // remove left
                if(checkVowels(s.charAt(i-k))){
                    count--;
                }

                // add right
                if(checkVowels(s.charAt(i))){
                    count++;
                }

                max = Math.max(max, count);
            }

            return max;
        }

        public boolean checkVowels(char c){

            c = Character.toLowerCase(c);

            return c=='a' ||
                    c=='e' ||
                    c=='i' ||
                    c=='o' ||
                    c=='u';
        }
    public static void main(String[] args) {
            String s = "leetcode";
            int k = 2;
            Leetcode1456 leetcode1456 = new Leetcode1456();
            System.out.println(leetcode1456.maxVowels(s, k));
    }
}
