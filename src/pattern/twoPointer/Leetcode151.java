package pattern.twoPointer;

public class Leetcode151 {


        public String reverseWords(String s) {

            String[] str = s.trim().split("\\s+");

            String st = "";

            for (int i = str.length - 1; i >= 0; i--) {
                st += str[i];

                if (i != 0) {
                    st += " ";
                }
            }

            return st;
        }
    public static void main(String[] args) {
            String s = " Hello World";
            Leetcode151 leetcode151 = new Leetcode151();
            System.out.println(leetcode151.reverseWords(s));
    }
}
