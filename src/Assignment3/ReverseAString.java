package Assignment3;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String ");
        String a = input.nextLine();
        Rev(a);
    }
    static void Rev(String a){
        int s = 0;
        int e = a.length()-1;
        char[] chars = a.toCharArray();
        while(s<e){
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            s++;
            e--;

        }
        String reversed = new String(chars);
        System.out.println(reversed);

    }
}
