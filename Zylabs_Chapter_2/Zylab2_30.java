package Zylabs_Chapter_2;
import java.util.Scanner;

public class Zylab2_30 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        double numQuarters = scnr.nextInt();
        double numDimes = scnr.nextInt();
        double numNickels = scnr.nextInt();
        double numPennies = scnr.nextInt();

        double totalMoney = (numQuarters * QUARTER) + (numDimes * DIME) + (numNickels * NICKEL) + numPennies;
        double dollars = totalMoney / 100;
        System.out.printf("Amount: $%.2f\n", dollars);
    }
}
