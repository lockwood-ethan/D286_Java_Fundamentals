package Zylabs_Chapter_4;
import java.util.Scanner;

public class Zylab4_18 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int firstInt;
        int secondInt;

        firstInt = scnr.nextInt();
        secondInt = scnr.nextInt();

        if (secondInt < firstInt) {
            System.out.println("Second integer can't be less than the first.");
        }
        else {
            while (firstInt <= secondInt) {
                System.out.print("" + firstInt + " ");
                firstInt = firstInt + 5;
            }
            System.out.println("");
        }
    }
}
