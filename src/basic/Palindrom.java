// Q.To  find out whether the given String is Palindrome or not.

package basic;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        String retext = "";

        for(int i = arr.length - 1; i >= 0; i--){
            retext = retext + arr[i];
        }
        if(str.equalsIgnoreCase(retext)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


    }
}