package string;

public class OnlyDigits {
    public static void main(String[] args) {
        String str = "12345";

        boolean isDigitOnly = true;

        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)){
                isDigitOnly = false;
                break;
            }
        }

        System.out.println(isDigitOnly);
    }
}