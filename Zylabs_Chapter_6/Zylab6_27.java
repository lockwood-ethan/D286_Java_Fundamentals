package Zylabs_Chapter_6;
import java.util.Scanner;
import java.util.Random;

public class Zylab6_27 {

    // TODO: Define your method here
    public static String coinFlip(Random rand) {
        int resultNumber = rand.nextInt(2);
        String coinString;
        if (resultNumber == 0) {
            coinString = "Tails";
        }
        else {
            coinString = "Heads";
        }
        return coinString;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        int userInput = scnr.nextInt();

        // TODO: Complete main here
        for (int i = 0; i < userInput; ++i) {
            String result = coinFlip(rand);
            System.out.println(result);
        }

    }
}
