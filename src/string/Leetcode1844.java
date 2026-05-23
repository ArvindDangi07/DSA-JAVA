package string;

public class Leetcode1844 {

    public String replaceDigits(String s) {

        char[] arr = s.toCharArray();

        for(int i = 1; i < arr.length; i += 2){

            arr[i] =
                    (char)(arr[i - 1] + (arr[i] - '0'));
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "a1c1e1";

        Leetcode1844 leetcode = new Leetcode1844();

        System.out.println(leetcode.replaceDigits(s));
    }
}