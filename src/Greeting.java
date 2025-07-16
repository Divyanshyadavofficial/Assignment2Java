import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name");
        String name = input.nextLine();
        greet(name);
    }
    static void greet(String name){
        System.out.println("welcome"+" "+name);
    }
}
