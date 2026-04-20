package loop;

// Q. Java Program Vowel Or Consonant

import java.util.Scanner;

public class VowelsCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().toLowerCase().charAt(0);

        // Check alphabet first
        if (ch < 'a' || ch > 'z') {
            System.out.println("Invalid input");
            return;
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            System.out.println("Vowel: " + ch);
        } else {
            System.out.println("Consonant: " + ch);
        }
    }
}