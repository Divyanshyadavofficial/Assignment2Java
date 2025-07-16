import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of p,R,T ");
        double p = input.nextDouble();
        double r = input.nextDouble();
        double t = input.nextDouble();
        simple(p,r,t);
        input.close();

    }
    static void simple(double p,double r,double t){
        double SI = (p*r*t)/100;
        System.out.printf(" the SI is %.2f\n",SI);
    }
}
