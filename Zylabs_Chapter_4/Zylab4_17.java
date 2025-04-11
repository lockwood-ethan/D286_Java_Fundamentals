package Zylabs_Chapter_4;
import java.util.Scanner;

public class Zylab4_17 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String newString;

        userInput = scnr.nextLine();
        newString = "";

        for (int i = 0; i < userInput.length(); ++i) {
            if (Character.isLetter(userInput.charAt(i))) {
                newString = newString + userInput.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
