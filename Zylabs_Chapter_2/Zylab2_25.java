package Zylabs_Chapter_2;
import java.util.Scanner;

public class Zylab2_25 {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        userNum = userNum / divNum;
        System.out.print("" + userNum + " ");
        userNum = userNum / divNum;
        System.out.print("" + userNum + " ");
        userNum = userNum / divNum;
        System.out.println("" + userNum);
    }
}
