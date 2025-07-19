package Assignment3;

import java.util.Scanner;

public class Depriciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  the original value of asset: ");
        double originalVal = input.nextDouble();

        System.out.print("Enter the rate of depreciation: ");
        double rate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        double n = input.nextDouble();

        dep(originalVal,rate,n);
        input.close();
    }
    static void dep(double originalVal,double rate,double n){
        double value = originalVal-(rate*n);
        System.out.printf("the depreciated  value after years %.2f ",value);
    }
}
