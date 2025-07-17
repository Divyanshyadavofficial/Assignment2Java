package Assignment3;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No number was entered.");
        } else {
            System.out.println("The largest number entered is: " + max);
        }

        input.close();
    }
}


