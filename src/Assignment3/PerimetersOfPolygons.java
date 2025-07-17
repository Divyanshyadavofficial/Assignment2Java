package Assignment3;

import java.util.Scanner;

public class PerimetersOfPolygons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the polygon name for whose you want calc the perimeter\n" +
                " the available choices are \n perimeter of Circle, EquilateralTriangle, Parallelogram," +
                "Rectangle, sqaure, rhombus");
        String str = input.nextLine();
        if(str.equals("Circle")){
            System.out.print("enter the value of radius ");
            double r  = input.nextInt();
            System.out.printf("perimeter of circle is .%2f ",2*3.14*r);
            System.out.println();
        } else if (str.equals("EquilateralTriangle")) {
            System.out.print("enter the value of side ");
            double side = input.nextDouble();
            System.out.printf("perimeter of triangle is .%2f",3*side);
            System.out.println();
        } else if (str.equals("Parallelogram")) {
            System.out.println("Enter the values of length and breadth");
            double length = input.nextDouble();
            double breadth = input.nextDouble();
            System.out.printf(" the perimeter of parallelogram is .%2f ",2*(length+breadth));
            System.out.println();
        } else if (str.equals("Rectangle")) {
            System.out.println("enter the values of length and breadth");
            double lengthRet = input.nextDouble();
            double breadthRet = input.nextDouble();
            System.out.printf(" the perimeter of rectangle is .%2f ",2*(lengthRet+breadthRet));
            System.out.println();
        } else if (str.equals("square")) {
            System.out.println("enter the value of side of sqaure");
            double s = input.nextDouble();
            System.out.printf("the perimeter of square is .%2f ",4*s);
            System.out.println();
        } else if (str.equals("rhombus")) {
            System.out.println("enter the value of side of rhombus");
            double sr = input.nextDouble();
            System.out.printf("the perimeter of rhombus is .%2f ",4*sr);
            System.out.println();
        }
        input.close();
    }
}
