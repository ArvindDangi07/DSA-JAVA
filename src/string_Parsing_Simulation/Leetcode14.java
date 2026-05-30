package string_Parsing_Simulation;

public class Leetcode14 {


        public String longestCommonPrefix(String[] strs) {

            String first = strs[0];

            for(int i = 0; i < first.length(); i++) {

                char ch = first.charAt(i);

                for(int j = 1; j < strs.length; j++) {

                    if(i >= strs[j].length() ||
                            strs[j].charAt(i) != ch) {

                        return first.substring(0, i);
                    }
                }
            }

            return first;
        }
    public static  void main(String[] args){
            String []  strs = {"flower","flow","flight"};
            Leetcode14 leetcode = new Leetcode14();
            System.out.println(leetcode.longestCommonPrefix(strs));
    }
}
