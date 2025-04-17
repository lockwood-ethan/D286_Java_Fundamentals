package Zylabs_Chapter_6;
import java.util.Scanner;

public class Zylab6_26 {
    /* Define your method here */
    public static void swapValues(int[] values) {
        int temp = values[3];
        values[3] = values[2];
        values[2] = temp;
        temp = values[0];
        values[0] = values[1];
        values[1] = temp;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int[] values = new int[4];

        for (int i = 0; i < values.length; ++i) {
            values[i] = scnr.nextInt();
        }

        swapValues(values);

        for (int i = 0; i < values.length; ++i) {
            if (i == 3) {
                System.out.println("" + values[i]);
            }
            else {
                System.out.print("" + values[i] + " ");
            }
        }
    }
}
