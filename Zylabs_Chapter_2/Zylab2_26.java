package Zylabs_Chapter_2;
import java.util.Scanner;

public class Zylab2_26 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int ageYears;
        int weightPounds;
        int heartRate;
        int timeMinutes;
        double calories;

        ageYears = scnr.nextInt();
        weightPounds = scnr.nextInt();
        heartRate = scnr.nextInt();
        timeMinutes = scnr.nextInt();

        calories = ((ageYears * 0.2757) + (weightPounds * 0.03295) + (heartRate * 1.0781) - 75.4991) * timeMinutes / 8.368;
        System.out.print("Calories: ");
        System.out.printf("%.2f", calories);
        System.out.println(" calories");
    }
}
