package Assignment3;

import java.util.Scanner;

public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the values of x1,y1 and x2,y2 ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        distance(x1,y1,x2,y2);
    }
    static void distance(double x1,double y1,double x2,double y2){
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("the distance between two points is %.2f ",distance);
    }
}
