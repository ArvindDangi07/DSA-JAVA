package recursion;

public class Palindrome_recursion {

    public static boolean f(int i,String str){
        int n = str.length();
        if(i>=n/2){
            return true;
        }

        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }


        return f(i+1,str);
    }

    public static void main(String[] args) {
        String str = "MADpM";

        System.out.println(f(0,str));



    }
}
