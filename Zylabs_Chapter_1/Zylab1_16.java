package Zylabs_Chapter_1;
import java.util.Scanner;

public class Zylab1_16 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentPrice;
        int lastMonthsPrice;

        currentPrice = scnr.nextInt();
        lastMonthsPrice = scnr.nextInt();

        /* Type your code here. */
        int priceDifference = currentPrice - lastMonthsPrice;
        double monthlyPayment = (currentPrice * 0.051) / 12;

        System.out.println("This house is $" + currentPrice + ". The change is $" + priceDifference + " since last month.");
        System.out.println("The estimated monthly mortgage is $" + monthlyPayment + ".");
    }
}
