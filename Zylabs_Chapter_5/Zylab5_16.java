package Zylabs_Chapter_5;
import java.util.Scanner;

public class Zylab5_16 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        double[] userValues = new double[20];
        
        int numValues = scnr.nextInt();
        double maxValue = userValues[0];

        for (int i = 0; i < numValues; ++i) {
            userValues[i] = scnr.nextDouble();
            if (userValues[i] > maxValue) {
                maxValue = userValues[i];
            }
        }
        for (int i = 0; i < numValues; ++i) {
            userValues[i] = userValues[i] / maxValue;
            System.out.printf("%.2f", userValues[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
