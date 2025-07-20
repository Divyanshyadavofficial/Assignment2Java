package Assignment3;

import java.util.Scanner;

public class SumOfDigitsOfaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digit ");
        int n = input.nextInt();
        sumdigits(n);

    }
    static void sumdigits(int n){
        int sum= 0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.printf("the sum of its digits is  %d ",sum);

    }
}
