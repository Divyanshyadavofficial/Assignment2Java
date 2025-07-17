package Assignment3;

import java.util.Scanner;

    public class AreaOfPolygons {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("which polygon area you want to calculate and available polygons are\n Circle,triangle,Rectangle,isosceles triangle,\n parallelogram,rhombus,equilateral triangle: ");
            String str = input.nextLine();
            if(str.equals("Circle")){
                System.out.print("Enter the value of radius of circle ");
                double r = input.nextDouble();
                AreaOfCircle(r);
                System.out.println();
            }
            else if(str.equals("triangle")){
                System.out.print(" Enter the values of base and height of triangle ");
                double base = input.nextDouble();
                double height = input.nextDouble();
                AreaOfTriangle(base,height);
                System.out.println();
            }
            else if(str.equals("Rectangle")){
                System.out.print("Enter the values of length and breadth of a Rectangle ");
                double length = input.nextDouble();
                double breadth = input.nextDouble();
                AreaOfRectangle(length,breadth);
                System.out.println();
            } else if (str.equals("isosceles triangle")) {
                System.out.print("Enter the values of base and height for isosceles triangle ");
                double baseiso  = input.nextDouble();
                double heightiso = input.nextDouble();
                AreaOfIsocelesTriangle(baseiso,heightiso);
                System.out.println();

            } else if (str.equals("parallelogram")) {
                System.out.print("Enter the values of base and height for parallelogram ");
                double basePara = input.nextDouble();
                double heightPara = input.nextDouble();
                AreaOfParallelogram(basePara,heightPara);
                System.out.println();
            } else if (str.equals("rhombus")) {
                System.out.print("Enter the value of diagonals for rhombus ");
                double d1 = input.nextDouble();
                double d2 = input.nextDouble();
                AreaOfRhombus(d1,d2);
                System.out.println();

            }else if(str.equals("equilateral triangle")){
                System.out.print("Enter the value of length of side for equilateral triangle ");
                double a = input.nextDouble();
                AreaOfEquilateralTriangle(a);
                System.out.println();
            }
            input.close();



        }
        static void AreaOfCircle(double r){
            System.out.printf("Area of circle is %.2f",3.14*r*r);

        }

        static void AreaOfTriangle(double base,double height){
            System.out.printf("Area of Triangle is %.2f",0.5*(base*height));

        }

        static void AreaOfRectangle(double length,double breadth){
            System.out.printf("Area of Rectangle is %.2f",length*breadth);

        }

        static void AreaOfIsocelesTriangle(double baseiso,double heightiso){
            System.out.printf("Area of Triangle is %.2f",0.5*(baseiso*heightiso));

        }

        static void AreaOfParallelogram(double basePara,double heightPara) {
            System.out.printf("Area of parallelogram is %.2f", basePara * heightPara);
        }

        static void AreaOfRhombus(double d1,double d2){
            System.out.printf("Area of rhombus is %.2f",0.5*d1*d2);
        }
        static void AreaOfEquilateralTriangle(double a){
            double area = (Math.sqrt(3)/4)*a*a;
            System.out.printf("Area of Equilateral Triangle is %.2f",area);
        }
    }

