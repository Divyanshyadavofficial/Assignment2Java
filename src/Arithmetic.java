import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of a ");
        double a = input.nextDouble();
        System.out.print("enter the value of b ");
        double b = input.nextDouble();
        System.out.print("enter a operator ");
        char operator = input.next().charAt(0);
        operations(a,b,operator);
        input.close();


    }
    static void operations(double a,double b,char operator){
        if (operator=='+'){
            System.out.printf("addition of a and b is  %.2f \n",a+b);
        }
        if (operator=='-'){
            System.out.printf("Subtraction of a and b is  %.2f \n",a-b);
        }
        if (operator=='*'){
            System.out.printf("multiplication of a and b is  %.2f \n",a*b);
        }
        if (operator=='/'){
            System.out.printf("division of a and b is  %.2f \n" ,a/b);
        }
        if (operator=='%'){
            System.out.printf("modulus of a and b is  %.2f \n" ,a%b);
        }
    }
}
