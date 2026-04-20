package loop;

import java.util.Scanner;

public class RunRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current run: ");
        int run = sc.nextInt();
        System.out.print("Enter total played ball: ");
        int ball = sc.nextInt();

        battingAverage(run, ball);

    }
    static  void battingAverage(int run, int ball) {

        if (ball == 0) {
            System.out.println("No batting average.");
            return;
        }
        double over = (double) ball/6.0;
        System.out.println("Run rate per over : " + run/over);


    }
}
