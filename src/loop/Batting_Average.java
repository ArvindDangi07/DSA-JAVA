package loop;

// Q. Calculate Batting Average

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current run: ");
        int run = sc.nextInt();
        System.out.print("Enter total outs: ");
        int outs = sc.nextInt();

        battingAverage(run, outs);

    }
    static void battingAverage(int runs, int outs) {

        if (outs == 0) {
            System.out.println("Average not defined (never out)");
            return;
        }

        double avg = (double) runs / outs;
        System.out.println("Batting Average: " + avg);
    }
}
