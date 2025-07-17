package Assignment3;

import java.util.Scanner;

public class VolumesOfPolygons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of polygon for which you want to calculate the volume of" +
                "\n the available choices are \n Cone,Prism,Cylinder,Sphere,Pyramid : ");
        String str = input.nextLine();
        if(str.equals("Cone")){
            VolumeOfCone();
        } else if (str.equals("Prism")) {
            VolumeOfPrism();
        } else if (str.equals("Cylinder")) {
            VolumeOfCylinder();
        } else if (str.equals("Sphere")) {
            VolumeOfSphere();
        } else if(str.equals("Pyramid")){
            VolumeOfPyramid();
        }
        input.close();

    }

    static void VolumeOfCone(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values of r and h for cone ");
        double r = input.nextDouble();
        double h = input.nextDouble();
        double v = 1.0/3.0*(3.14*r*r*h);
        System.out.printf(" the volume of cone is %.2f ",v);
        System.out.println();
        input.close();
    }
    static void VolumeOfPrism(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of l, w , h ");
        double l = input.nextDouble();
        double w = input.nextDouble();
        double h = input.nextDouble();
        double v = l*w*h;
        System.out.printf(" the volume of prism is %.2f ",v);
        System.out.println();
        input.close();
    }
    static void VolumeOfCylinder(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the values of r and h ");
        double r = input.nextDouble();
        double h = input.nextDouble();
        double v = 3.14*r*r*h;
        System.out.printf("the volume of cylinder is %.2f",v);
        System.out.println();
        input.close();
    }
    static void VolumeOfSphere(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of r ");
        double r = input.nextDouble();
        double v = 4.0/3.0*(3.14*r*r*r);
        System.out.printf(" the volume of sphere is %.2f ",v);
        System.out.println();
        input.close();
    }
    static void VolumeOfPyramid(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values of base side and height ");
        double a = input.nextDouble();
        double h = input.nextDouble();
        double v = 1.0/3.0*(a*a*h);
        System.out.printf("the volume of pyramid is %.2f ",v);
        System.out.println();
        input.close();
    }
}
