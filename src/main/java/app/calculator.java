package app;

import java.util.Scanner;

public class calculator {

        public static void main(String[] args) {

            System.out.println("Enter the two numbers");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Sum of the a and b = " + Integer.sum(a,b));

        }
    }
