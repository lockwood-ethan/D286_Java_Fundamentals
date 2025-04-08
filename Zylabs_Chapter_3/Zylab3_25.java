package Zylabs_Chapter_3;
import java.util.Scanner;

public class Zylab3_25 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;

        isLeapYear = false;
        inputYear = scnr.nextInt();

        /* Type your code here. */
        if (inputYear % 4 == 0) {
            isLeapYear = true;
        }
        if ((inputYear % 10 == 0) && (inputYear % 100 == 0) && (inputYear % 400 != 0)) {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(inputYear + " - leap year");
        }
        else {
            System.out.println(inputYear + " - not a leap year");
        }
    }
    
}
