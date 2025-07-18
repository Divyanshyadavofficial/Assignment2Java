package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" for how many numbers you want to calculate the average ");
        int size = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("enter the numbers you want to calculate average for ");
        double sum = 0;
        double count =0;
        for (int i = 0; i < size; i++) {
            int n = input.nextInt();
            list.add(n);
        }

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            sum = sum+ list.get(i);
            count++;
        }
        System.out.printf("the Average till n numbers is %.2f ",(sum/count));

    }
}
