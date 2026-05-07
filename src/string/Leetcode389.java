package string;

public class Leetcode389 {

        public char findTheDifference(String s, String t) {

            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            for(char c : t.toCharArray()){
                freq[c-'a']--;
            }

            for(int i = 0;i<26;i++){
                if(freq[i]!=0){
                    return (char)(i+'a');
                }
            }
            return ' ';
        }

        public static void main(String[] args) {
            String s = "abcd", t = "abcde";

            Leetcode389 leetcode389 = new Leetcode389();
            System.out.println(leetcode389.findTheDifference(s,t));
        }
}
