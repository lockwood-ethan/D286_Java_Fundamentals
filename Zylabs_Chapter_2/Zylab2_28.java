package Zylabs_Chapter_2;
import java.math.BigDecimal;
import java.util.Scanner;

public class Zylab2_28 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int productNums1;
        int avgNums1;
        double productNums2;
        double avgNums2;
  
        /* Type your code here. */
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();
        productNums1 = num1 * num2 * num3 * num4;
        avgNums1 = (num1 + num2 + num3 + num4) / 4;
        System.out.println("" + productNums1 + " " + avgNums1);
        productNums2 = (double) (num1 * num2 * num3 * num4);
        avgNums2 = (double) (num1 + num2 + num3 + num4) / 4.0;
        System.out.printf("%.3f", productNums2);
        System.out.print(" ");
        System.out.printf("%.3f\n", avgNums2);
    }
}
