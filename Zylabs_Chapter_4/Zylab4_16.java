package Zylabs_Chapter_4;
import java.util.Scanner;

public class Zylab4_16 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String compLetter;
        String compWord;
        int letterCount;

        compLetter = scnr.next();
        compWord = scnr.nextLine();
        letterCount = 0;

        for (int i = 0; i < compWord.length(); ++i) {
            if (compWord.charAt(i) == compLetter.charAt(0)) {
                letterCount += 1;
            }
        }

        if (letterCount == 1) {
            System.out.println("" + letterCount + " " + compLetter);
        }
        else {
            System.out.println("" + letterCount + " " + compLetter + "'s");
        }
    }
    
}
