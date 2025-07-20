package Assignment3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check whether is palindrome or not ");
        int n = input.nextInt();
        System.out.println();
        palin(n);
        input.close();
    }
    static void palin(int n){
        int reversed=0;
        int original = n;
        while(n>0) {
            int last = n % 10;
            reversed = reversed * 10 + last;
            n= n/10;
        }
         if(original==reversed){
             System.out.println("true");
         }else{
             System.out.println("false");
         }

    }
}
