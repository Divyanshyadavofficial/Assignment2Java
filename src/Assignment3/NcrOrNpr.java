package Assignment3;

import java.util.Scanner;

public class NcrOrNpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = input.nextInt();
        System.out.print("Enter the value of r ");
        int r = input.nextInt();
        int ncr = Ncr(n,r);
        System.out.printf("the value of ncr is  %d ",ncr);
        int npr = Npr(n,r);
        System.out.println();
        System.out.printf("the value of npr is %d ",npr);
        input.close();
    }

    static int factn(int n){
        if(n==0||n==1){
            return 1;
        }else {
            return n*factn(n-1);
        }
    }

    static int Ncr(int n,int r){
         return factn(n)/factn(r)*(factn(n-r));


    }
    static int Npr(int n,int r){
        return factn(n)/factn(n-r);

    }
}
