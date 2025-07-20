package Assignment3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year ");
        int year = input.nextInt();
        leap(year);
        input.close();
    }
    static void leap(int year){
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("it is a leap year");
        }else {
            System.out.println("not a leap year ");
        }
    }
}
