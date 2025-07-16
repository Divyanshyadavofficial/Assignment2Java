import java.util.Scanner;

public class LargestNO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Math.max(a,b));
        input.close();


    }
}
