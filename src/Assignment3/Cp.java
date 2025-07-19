package Assignment3;

import java.util.Scanner;

public class Cp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Principal amount ");
        double principleAmt = input.nextDouble();
        System.out.print("Enter the value of annual interest rate ");
        double rate = input.nextDouble();
        System.out.print("Enter the value of number of times interest is compounded per year in the form 0.something ");
        double n = input.nextDouble();
        System.out.print("Enter the value of time in years ");
        double t = input.nextDouble();
        compoundInterest(principleAmt,rate,n,t);
        input.close();
    }
    static void compoundInterest(double p,double r,double n,double t){
        double finalAmt = Math.pow((1+r/n),(n*t))*p;
        double ci = finalAmt - p;
        System.out.printf("the compound interest is %.2f ",ci);
    }
}
