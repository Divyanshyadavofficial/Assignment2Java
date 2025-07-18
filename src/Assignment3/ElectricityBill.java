package Assignment3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of units consumed: ");
        double units = input.nextDouble();
        Electricity(units);
    }

    static void Electricity(double units){
        System.out.println("the charges are as follows\n" +
                "from units 0 to 100 no charge\n"+
                "from units 101 to 200 5 rupees per unit\n"+
                "from units 200 and above 10 rupees per unit\n"+
                "if the total amount is exceeding 1000 a 10 percent\n"+
                "surcharge is added to the total bill."
        );
        System.out.println();
        double totalBill = 0;
        if(units<=100){
            System.out.printf("No Charge as no units are consumed%.2f ",totalBill);
        } else if (units<=200) {
            totalBill = (units-100)*5;

        }else {
            totalBill = 100 *5 + (units-200)*10;
        }
        if(totalBill>1000){
            totalBill+=totalBill*0.10;
        }
        System.out.printf("the total bill is %.2f",totalBill);
        System.out.println();


    }
}
