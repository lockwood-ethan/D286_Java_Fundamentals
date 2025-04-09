package Zylabs_Chapter_4;
import java.util.Scanner;

public class Zylab4_14 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int x;

        x = scnr.nextInt();

        while (x > 0) {
            System.out.print(x % 2);
            x = x / 2;
        }
        System.out.println();
    }
}
