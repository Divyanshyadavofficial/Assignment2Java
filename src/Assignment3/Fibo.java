package Assignment3;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print(" enter the number till you want to generate the fibonacci series : ");
        int n = input.nextInt();
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+ " ");

        }
    }
    static int fib(int n){
        if(n==0||n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
