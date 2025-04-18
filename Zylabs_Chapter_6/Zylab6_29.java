package Zylabs_Chapter_6;
import java.util.Scanner;

public class Zylab6_29 {

    /* Define your method here */
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
        int count = 0;
        for (int i = 0; i < listSize; ++i) {
            if (currWord.equalsIgnoreCase(wordsList[i])) {
                count += 1;
            }
        }
        return (count);
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String[] wordsList = new String[20];
        int wordCount;
        int listSize = scnr.nextInt();

        for (int i = 0; i < listSize; ++i) {
            wordsList[i] = scnr.next();
        }
        for (int i = 0; i < listSize; ++i) {
            wordCount = getWordFrequency(wordsList, listSize, wordsList[i]);
            System.out.println("" + wordsList[i] + " " + wordCount);
        }
    }
}
