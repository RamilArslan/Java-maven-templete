package app;

import java.util.Arrays;

public class exampleRandom {
    public static void main(String[] args) {
        final int LEN =30;
        // 1. creating
        int [] even = new int [LEN];
        int [] odd = new int[LEN];





        //2. calculating
        int sumEven =0;
        int sumOdd = 0;
        int SumTotal = sumEven + sumOdd;
for (int el:even){
    sumEven+= el;

}for (int i=0;i<odd.length;i++){
    sumOdd += odd[i];
}


        //3.print
        System.out.printf("Even: %s\n" , Arrays.toString(even));
        System.out.printf("Odd: %s\n" , Arrays.toString(odd));
        System.out.printf("The sum of the even numbers: %s\n" , sumEven);
        System.out.printf("The sum of the odd numbers: %s\n" , sumOdd);
        System.out.printf("The sum of the total numbers: %s\n" , sumEven + sumOdd);
    }



}
