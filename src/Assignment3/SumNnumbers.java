package Assignment3;

import java.util.Scanner;

public class SumNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        double n = input.nextDouble();
        SumOfn(n);
        input.close();
    }
    static void SumOfn(double n){
        double sum =0;
        for (int i = 0; i <=n ; i++) {
            sum = sum+i;
        }
        System.out.printf(" the sum of N numbers is %.2f ",sum);
    }
}
