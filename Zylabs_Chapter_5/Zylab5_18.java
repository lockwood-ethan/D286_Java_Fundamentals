package Zylabs_Chapter_5;
import java.util.Scanner;

public class Zylab5_18 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int numValues = scnr.nextInt();
        String[] stringValues = new String[20];

        for (int i = 0; i < numValues; ++i) {
            stringValues[i] = scnr.next();
        }

        String magicLetter = scnr.next();

        for (int i = 0; i < numValues; ++i) {
            if (stringValues[i].contains(magicLetter)) {
                System.out.print("" + stringValues[i] + ",");
            }
        }
        System.out.println();
        // test

    }
}
