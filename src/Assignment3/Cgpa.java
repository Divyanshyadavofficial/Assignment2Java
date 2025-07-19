package Assignment3;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the grade points scored in A subject out of 100: ");
        double A = input.nextDouble();
        System.out.print("Enter the grade points scored in B subject out of 100: ");
        double B = input.nextDouble();
        System.out.print("Enter the grade points scored in C subject out of 100: ");
        double C = input.nextDouble();
        System.out.print("Enter the grade points scored in D subject out of 100: ");
        double D = input.nextDouble();
        System.out.print("Enter the grade points scored in E subject out of 100: ");
        double E = input.nextDouble();

        double Avg = (A+B+C+D+E)/500;
        if(Avg<0.33){
            System.out.println("you failed in exams you need to reappear ");
        }
        else {
            System.out.printf("the cgpa is %.2f ",Avg);
        }
        if(A<33){
            System.out.println("you have a reappear in subject A ");
        }
        if(B<33){
            System.out.println("you have a reappear in subject B ");
        }
        if(C<33){
            System.out.println("you have a reappear in subject C ");
        }
        if(D<33){
            System.out.println("you have a reappear in subject D ");
        }
        if(E<33){
            System.out.println("you have a reappear in subject E ");
        }
        input.close();


    }
}
