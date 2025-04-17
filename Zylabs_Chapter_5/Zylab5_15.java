package Zylabs_Chapter_5;
import java.util.Scanner;

public class Zylab5_15 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];

        /* Type your code here. */
        int numValues = scnr.nextInt();

        for (int i = 0; i < numValues; ++i) {
            userValues[i] = scnr.nextInt();
        }

        int thresholdInput = scnr.nextInt();

        for (int i = 0; i < numValues; ++i) {
            if (userValues[i] <= thresholdInput) {
                System.out.print("" + userValues[i] + ",");
            }
            if (i == numValues - 1) {
                System.out.println();
            }
        }
    }
}
