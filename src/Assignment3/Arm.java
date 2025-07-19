package Assignment3;

import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check whether a given number is armstrong or not: ");
        int n =  input.nextInt();
        boolean result = armstrong(n);
        System.out.println(result);

    }
    static boolean armstrong(int n){
        int original = n;
        int sum =0;
        int digit;
        int  digits = String.valueOf(n).length();

        while (n>0){

            digit = n%10;
            sum = sum+(int)Math.pow(digit,digits);
            n = n/10;
        }
        return sum == original;

    }
}
