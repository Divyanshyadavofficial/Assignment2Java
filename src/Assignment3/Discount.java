package Assignment3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original price and discount percentage ");
        double originalPrice = input.nextDouble();
        double discount = input.nextDouble();
        calc(originalPrice,discount);
    }
    static void calc(double originalPrice,double discount){
        double discountPrice = (originalPrice*discount)/100;
        double finalPrice = originalPrice - discountPrice;
        System.out.printf("the costumer has to pay %.2f",finalPrice);
    }
}
