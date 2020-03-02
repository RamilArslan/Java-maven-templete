package app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to my calculator");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();




        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
        System.out.println("Result is:  "+(a+b));
        if (scan.equals("quit")) {
            System.out.println("Thanks for using my program.");
            System.exit(0);
        }


    }
}
