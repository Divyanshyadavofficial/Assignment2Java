package Assignment3;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet ");
        char alpha = input.next().charAt(0);
        isAlpha(alpha);
        input.close();
    }
    static void isAlpha(char alpha){
        if(alpha=='a'||alpha=='A'||alpha=='i'||alpha=='I'||alpha=='o'||alpha=='e'||alpha=='E'||alpha=='u'||alpha=='U'){
            System.out.println(alpha);
            System.out.println("this is is a vowel");

        }else{
            System.out.println(alpha);
            System.out.println("This is a consonant");
        }
        if((alpha>='a'&&alpha<='z')||(alpha>='A'&&alpha<='Z')){
            System.out.println("It is an alphabet");
        }else {
            System.out.println("this is not a alphabet");
        }
    }
}
