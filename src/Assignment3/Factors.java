package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to find its factors ");
        int n = input.nextInt();
        factors(n);
    }
    static void factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
