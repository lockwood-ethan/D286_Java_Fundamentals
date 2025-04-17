package Zylabs_Chapter_5;
import java.util.Scanner;

public class Zylab5_14 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];

        /* Type your code here. */
        int currentValue = scnr.nextInt();
        int numValues = 0;
        while (currentValue >= 0) {
            userValues[numValues] = currentValue;
            currentValue = scnr.nextInt();
            numValues += 1;
        }
        if (numValues > 9) {
            System.out.println("Too many numbers");
        }
        else {
            int middleIndex = numValues / 2;
            System.out.println("Middle item: " + userValues[middleIndex]);
        }
    }
}
