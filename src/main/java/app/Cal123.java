package app;

import java.util.Scanner;

public class Cal123 {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to my calculator");
        System.out.println("If you want to leave, type \"quit\"");

        Scanner input = new Scanner(System.in);
        Maths maths = new Maths();

        double answer = 0;
        double numA, numB;
        char operator;
        boolean quit = false;

        while (true) {
            System.out.println("Please enter your equation: ");
            String s=input.next();
            if(s.equals("quit")){
                System.out.println("Thanks for using my program");
                System.exit(0);
            }
            numA = Double.parseDouble(s);
            operator = input.next().charAt(0);
            numB = input.nextDouble();

            if (operator == '+') {
                answer = maths.add(numA, numB);
            }

            if (operator == '-') {
                answer = maths.subtract(numA, numB);
            }

            if (operator == '*') {
                answer = maths.multiply(numA, numB);
            }

            if (operator == '/') {
                answer = maths.divide(numA, numB);
            }

            if (operator == '^') {
                answer = maths.power(numA, numB);
            }

            System.out.println(answer);
        }
    }
}

class Maths {

    double add(double a, double b) {
        return a+b;
    }

    double subtract(double a, double b) {
        return a-b;
    }

    double multiply(double a, double b) {
        return a*b;
    }

    double divide(double a, double b) {
        return a/b;
    }

    double power(double a, double b){
        double answer =a;

        for (int x=2; x<=b; x++){
            answer *= a;
        }

        return answer;
    }
}

