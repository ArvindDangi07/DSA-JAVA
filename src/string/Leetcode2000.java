package string;

public class Leetcode2000 {


        public String reversePrefix(String word, char ch) {

            int n=-1;
            char[] arr = word.toCharArray();
            for(int i = 0;i<word.length();i++){

                if(word.charAt(i)==ch){

                    n=i;
                    break;

                }
            }

            if(n==-1){
                return word;
            }

            int left = 0;
            int right = n;




            while(left < right){

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            return new String(arr);

        }
    public static void main(String[] args) {
            String word = "abcdefd";
            char ch = 'd';
            Leetcode2000 leetcode2000 = new Leetcode2000();
            System.out.println(leetcode2000.reversePrefix(word,ch));
    }
}
