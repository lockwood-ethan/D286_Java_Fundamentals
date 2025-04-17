package Zylabs_Chapter_5;
import java.util.Scanner;

public class Zylab5_17 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String[] stringValues = new String[20];
        int[] countValues = new int[20];
        int numValues = scnr.nextInt();

        for (int i = 0; i < numValues; ++i) {
            stringValues[i] = scnr.next();
        }
        for (int i = 0; i < numValues; ++i) {
            for (int j = 0; j < numValues; ++j) {
                if (stringValues[i].equals(stringValues[j])) {
                    countValues[i] = countValues[i] + 1;
                }
            }
            System.out.println("" + stringValues[i] + " - " + countValues[i]);
        }
    }
}
