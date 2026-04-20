package loop;

// Q. Reverse A String In Java

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string : ");
        String str = sc.nextLine();

        // Handle empty input
        if (str == null || str.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        char[] arr = str.toCharArray();



        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}


/*

  String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    static String reverseString(String str) {
        // Best approach using StringBuilder
        return new StringBuilder(str).reverse().toString();
    }

 */