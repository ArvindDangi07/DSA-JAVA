package loop;

import java.util.Scanner;

// Q. Calculate Average Of N Numbers

public class Average {
    public static void main(String[] args) {

        System.out.println("Enter numbers (0 to stop): ");
        System.out.println("Average is: " + average());
    }

    static double average() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            sum += n;
            count++;
        }

        if (count == 0) {
            return 0; // safe handling
        }

        return (double) sum / count;
    }
}