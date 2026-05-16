package string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "I Love You";
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for(String word : words){
            char[] arr = word.toCharArray();
            int left = 0;
            int right = arr.length - 1;
            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            result.append(new String(arr)).append(" ");
        }
        System.out.println(result.toString());

    }
}
