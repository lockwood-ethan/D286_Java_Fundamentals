package Zylabs_Chapter_5;
import java.util.Scanner;

public class Zylab5_13 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;


        numElements = scnr.nextInt();

        /* Type your code here. */
        for (int i = 0; i < numElements; ++i) {
            userList[i] = scnr.nextInt();
        }

        for (int i = numElements - 1; i >= 0; --i) {
            if (i == 0) {
                System.out.println("" + userList[i] + ",");
            }
            else {
                System.out.print("" + userList[i] + ",");
            }
        }
    }
}
