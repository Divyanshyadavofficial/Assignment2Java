package Assignment3;

import java.util.Scanner;

public class PowerinJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values of base and exponent ");
        double base = input.nextDouble();
        double exponent = input.nextDouble();
        power(base,exponent);
        input.close();

    }
    static void power(double b, double e){
        double pow = 1;
        for (int i = 1; i <=e ; i++) {
             pow = b*pow;

        }
        System.out.println(pow);


    }
}
