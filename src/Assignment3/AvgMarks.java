package Assignment3;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects ");
        double n = input.nextDouble();
        System.out.print("Enter the marks obtained in  subjects ");
        double marks = input.nextDouble();
        avg(n,marks);
        input.close();
    }
    static void avg(double n,double marks){
        double marksAvg = marks/n;
        System.out.printf("the Average marks scored by the student is %.2f ",marksAvg);
    }

}
