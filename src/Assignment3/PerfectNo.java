package Assignment3;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = input.nextInt();
        perfect(n);
    }
    static void perfect(int n){
        int sum = 0;
        int original = n;
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                sum=sum+i;
        }
        }
        if(sum==original){
            System.out.println("perfectNo");
        }
    }
}
