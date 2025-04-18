package Zylabs_Chapter_6;
import java.util.Scanner;

public class Zylab6_30 {
    
    public static int fibonacci(int n) {
        /* Type your code here */
        int firstTerm = 0;
        int secondTerm = 1;
        if (n < 0) {
            firstTerm = -1;
        }
        else {
            for (int i = 1; i <= n; ++i) {
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        return firstTerm;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum;

        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum +") is " + fibonacci(startNum));
    }
}
