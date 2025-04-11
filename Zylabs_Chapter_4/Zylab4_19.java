package Zylabs_Chapter_4;
import java.util.Scanner;

public class Zylab4_19 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String userInput;

        userInput = "";

        while (scnr.hasNext()) {
            if (scnr.hasNextLine()) {
                userInput = scnr.nextLine();
                if (userInput.equals("Done") || userInput.equals("done") || userInput.equals("d")) {
                    break;
                }
                for (int i = userInput.length() - 1; i >= 0; --i) {
                    System.out.print("" + userInput.charAt(i));
                }
            }
            System.out.println("");
        }
    }
}
