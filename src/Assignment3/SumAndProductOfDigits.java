package Assignment3;

import java.util.Scanner;

public class SumAndProductOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the Integer ");
        int n = input.nextInt();
        int sum = sum(n);
        int product = prod(n);
        int final_output = product - sum;
        System.out.println(final_output);
        input.close();
    }
    static int sum(int n){
        int finalSum = 0;
        while (n>0){
             finalSum += n%10;
            n = n/10;
        }
        return finalSum;
    }
    static int prod(int n){
        int finalProd =1;
        while (n>0) {
             finalProd *= n % 10;
            n = n / 10;
        }
        return finalProd;
    }

}
