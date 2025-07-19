package Assignment3;

import java.awt.*;
import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the values of total sales and commission  percentage");
        double totalSales = input.nextDouble();
        double commission  = input.nextDouble();
        commissionAmt(totalSales,commission);
        input.close();

    }
    static void commissionAmt(double totalSales,double commission){
        double amt = (totalSales*commission)/100;
        System.out.printf(" the commission earned is %.2f ",amt);
    }
}
