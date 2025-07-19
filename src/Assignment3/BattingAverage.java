package Assignment3;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total Runs Scored: ");
        double totalRuns = input.nextDouble();
        System.out.print("Enter the number of times the player is out: ");
        double out = input.nextDouble();
        batting(totalRuns,out);
        input.close();
    }
    static void batting(double totalRuns,double out){
        double avg = totalRuns/out;
        if(out == 0){
            System.out.println("Enter the correct value of number of times the player is out ");
        }else {
            System.out.printf("the batting average is  %.2f ", avg);
        }
    }
}
