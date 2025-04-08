package Zylabs_Chapter_3;
import java.util.Scanner;

public class Zylab3_24 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int totalPennies;
        int DOLLAR = 100;
        int QUARTER = 25;
        int DIME = 10;
        int NICKEL = 5;
        int tempValue;

        totalPennies = scnr.nextInt();

        if (totalPennies <= 0) {
            System.out.println("No change");
        }

        tempValue = totalPennies / DOLLAR;
        if (tempValue == 1) {
            System.out.println(tempValue + " Dollar");
        }
        else if (tempValue > 1) {
            System.out.println(tempValue + " Dollars");
        }

        tempValue = tempValue * DOLLAR;
        totalPennies = totalPennies - tempValue;

        tempValue = totalPennies / QUARTER;
        if (tempValue == 1) {
            System.out.println(tempValue + " Quarter");
        }
        else if (tempValue > 1) {
            System.out.println(tempValue + " Quarters");
        }

        tempValue = tempValue * QUARTER;
        totalPennies = totalPennies - tempValue;

        tempValue = totalPennies / DIME;
        if (tempValue == 1) {
            System.out.println(tempValue + " Dime");
        }
        else if (tempValue > 1) {
            System.out.println(tempValue + " Dimes");
        }

        tempValue = tempValue * DIME;
        totalPennies = totalPennies - tempValue;

        tempValue = totalPennies / NICKEL;
        if (tempValue == 1) {
            System.out.println(tempValue + " Nickel");
        }
        else if (tempValue > 1) {
            System.out.println(tempValue + " Nickels");
        }

        tempValue = tempValue * NICKEL;
        totalPennies = totalPennies - tempValue;

        if (totalPennies == 1) {
            System.out.println(totalPennies + " Penny");
        }
        else if (totalPennies > 1) {
            System.out.println(totalPennies + " Pennies");
        }

    }
}
