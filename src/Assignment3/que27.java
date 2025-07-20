package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class que27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        while(true){
            int n = input.nextInt();
            list.add(n);
            if(n==0) {
                break;
            }
        }
        sumNeg(list);
        System.out.println();
        sumPosEven(list);
        System.out.println();
        sumPosOdd(list);
        System.out.println();
    }
    static  void sumNeg(ArrayList<Integer>list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<0){
                sum=sum+ list.get(i);
            }
        }
        System.out.printf("the sum of negative numbers is %d ",sum);

    }
    static void sumPosEven(ArrayList<Integer>list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i)&1)==0){
                sum+= list.get(i);
            }
        }
        System.out.printf("the sum of even numbers is %d ",sum);
    }
    static void sumPosOdd(ArrayList<Integer>list){
        int sum = 0;
        for(int i = 0 ; i< list.size();i++){
            if((list.get(i)&1)==1){
                sum+= list.get(i);
            }
        }
        System.out.printf("the sum of odd numbers is %d ",sum);

    }
}
