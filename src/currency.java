import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value in Indian Ruppees ");
        double Ind = input.nextDouble();
        System.out.printf("The currency value in American Dollars is %.4f",Ind/85.23);
        input.close();
    }
}
