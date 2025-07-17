package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n;
        int sum=0;
        int largest =0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            n = input.nextInt();
            list.add(n);
            if(n==0){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {

            sum=sum+ list.get(i);

        }
        System.out.println(sum);
    }
}
