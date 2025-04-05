package Zylabs_Chapter_3;
import java.util.Scanner;

public class Zylab3_22 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        if ((num1 <= num2) && (num1 < num3)) {
            System.out.println(num1);
        }
        else if ((num2 < num1) && (num2 <= num3)) {
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
    }

}
        
        
