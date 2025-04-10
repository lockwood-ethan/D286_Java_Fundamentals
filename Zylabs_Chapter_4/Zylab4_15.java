package Zylabs_Chapter_4;
import java.util.Scanner;

public class Zylab4_15 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int userInput;
        int total;
        int maxValue;
        int countNum;
        double average;

        userInput = scnr.nextInt();
        total = 0;
        maxValue = 0;
        countNum = 0;

        while (userInput > -1) {
            if (userInput > maxValue) {
                maxValue = userInput;
            }
            total = total + userInput;
            countNum += 1;
            userInput = scnr.nextInt();
        }
        average = (double)(total) / countNum;
        System.out.print("" + maxValue + " ");
        System.out.printf("%.2f\n", average);
    }
}
