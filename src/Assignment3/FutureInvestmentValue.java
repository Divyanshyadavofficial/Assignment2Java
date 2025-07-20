package Assignment3;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of p ");
        int p = input.nextInt();
        System.out.print("enter the value of r ");
        int r = input.nextInt();
        System.out.print("enter the value of n the number of times the interest is compounded ");
        int n = input.nextInt();
        System.out.print("enter the value of time in years ");
        int t = input.nextInt();
        futureInvest(p,r,n,t);
    }
    static void futureInvest(int p,int r,int n,int t){
        double rate = r/100.0;
        double fv = p*Math.pow((1+rate/n),n*t);
        System.out.printf(" the future investment value is %.2f ",fv);
    }
}
