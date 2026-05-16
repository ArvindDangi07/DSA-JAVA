package string;

public class countVowels {
    public static void main(String[] args) {

        String str = "Arvind Dangi";
        char[] arr = str.toCharArray();
        int count =0;
        for(char c : arr){
            c=Character.toLowerCase(c);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
