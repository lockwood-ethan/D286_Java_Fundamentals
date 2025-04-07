package Zylabs_Chapter_3;
import java.util.Scanner;

public class Zylab3_23 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        highwayNumber = scnr.nextInt();
        primaryNumber = highwayNumber % 100;

        /* Type your code here. */
        if ((highwayNumber > 0) && (highwayNumber % 100 != 0)) {
            if ((highwayNumber > 0) && (highwayNumber < 100) && (highwayNumber % 2 == 0)) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            }
            else if ((highwayNumber > 0) && (highwayNumber < 100) && (highwayNumber % 2 != 0)) {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
            if ((highwayNumber > 99) && (highwayNumber < 1000) && (highwayNumber % 2 == 0)) {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
            }
            else if ((highwayNumber > 99) && (highwayNumber < 1000) && (highwayNumber % 2 != 0)) {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
            }
        }
        else {
            System.out.println(highwayNumber +" is not a valid interstate highway number.");
        }
    }
    
}
