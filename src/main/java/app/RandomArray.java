package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        int[] randomNumbers = new int[30];
        int[] evenNumbers = new int[30];
        int[] oddNumbers = new int [30];
        int a = 0, b = 0;

        for (int i = 0; i< randomNumbers.length; i++ ){
            evenNumbers[i] = (int)(Math.random() * 20);
        }

        for (int i= 0; i< 25; i++){
            if (randomNumbers[i] % 2 == 0) {
                evenNumbers[a]= randomNumbers[i];
                a++;
            }else {
                oddNumbers[i] = randomNumbers[i];
                b++;
            }

        }
        System.out.println("Even :");
        for (int i = 0; i< evenNumbers.length; i++){
            System.out.println(evenNumbers[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Odd : ");
        for (int i= 0; i<oddNumbers.length; i++){
            System.out.println(oddNumbers[i] + " ");
        }

    }

}