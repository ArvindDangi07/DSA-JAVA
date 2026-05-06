package string;

public class FirstNonRepeatinChar {
    public static void main(String[] args) {
        String str = "aravvind";
        int[] freq = new int[26];
        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }
       for(char ch : str.toCharArray()){
           if(freq[ch-'a']==1){
               System.out.println(ch);
               break;
           }
       }
    }
}
