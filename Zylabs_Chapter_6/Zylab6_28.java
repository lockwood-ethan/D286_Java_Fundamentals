package Zylabs_Chapter_6;
import java.util.Scanner;

public class Zylab6_28 {
    
    /* Define your method here */
    public static void sortArray(int[] myArr, int arrSize) {
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                if (myArr[j] < myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            } 
        }
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int[] myArr = new int[20];
        int arrSize= scnr.nextInt();

        for (int i = 0; i < arrSize; ++i) {
            myArr[i] = scnr.nextInt();
        }

        sortArray(myArr, arrSize);

        for (int i = 0; i < arrSize; ++i) {
            if (i == arrSize - 1) {
                System.out.println("" + myArr[i] + ",");
            }
            else {
                System.out.print("" + myArr[i] + ",");
            }
        }
    }
}
