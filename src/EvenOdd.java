import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("enter the number ");
        int n = input.nextInt();
        isEvenOdd(n);
    }
    static void isEvenOdd(int n){
        if((n&1)==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
