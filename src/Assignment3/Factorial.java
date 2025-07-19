package Assignment3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = input.nextInt();
        double factorialn = factorial(n);
        System.out.printf("the factorial of a number is %.2f ",factorialn);
        input.close();
    }
    static  int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
