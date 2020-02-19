package app;

public class sample {
    public static void main(String[] args) {
        int [] evenArry = new int [30];
        int [] oddArry = new int [30];
        int even=0, odd=0;
        for (int i =0; i<evenArry.length; i++){
            if (i%2 ==0)
                even += evenArry[i];
            else
                odd += oddArry[i];

        }
        System.out.println("Even sum :" + even);
        System.out.println("Odd sum : " + odd);
    }
}
