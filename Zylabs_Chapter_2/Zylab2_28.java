package Zylabs_Chapter_2;
import java.util.Scanner;

public class Zylab2_28 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int productNums;
        int avgNums;

        /* Type your code here. */
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();
        productNums = num1 * num2 * num3 * num4;
        avgNums = (num1 + num2 + num3 + num4) / 4;
        System.out.println("" + productNums + " " + avgNums);
    }
    
}
