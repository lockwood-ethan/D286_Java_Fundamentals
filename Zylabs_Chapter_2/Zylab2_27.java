package Zylabs_Chapter_2;
import java.util.Scanner;

public class Zylab2_27 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x;
        double y;
        double z;
        /* Type your code here */
        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();
        System.out.println("" + Math.pow(x, z) + " " + Math.pow(x, Math.pow(y, z)) + " " + Math.abs(y) + " " + Math.sqrt(Math.pow((x * y), z)));
    }
}
