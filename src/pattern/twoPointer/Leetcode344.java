package pattern.twoPointer;

public class Leetcode344 {

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a','r','v','i','n','d'};

        Leetcode344 obj = new Leetcode344();
        obj.reverseString(s);

        // print result
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}