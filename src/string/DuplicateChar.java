package string;
public class DuplicateChar {
    public static void main(String[] args) {
        String str = "aravvinidd";
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] > 1){
                char ch = (char)(i + 'a');
                System.out.println(ch);
            }
        }
    }
}