package app;

public class picture1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 22; i++) {
            for (int empty = 22; empty > i; empty--){

        System.out.print(" ");}
        for (int star = 0; star < (i* 2) - 1; star++) {
            System.out.print("*");
        }
        System.out.println();
    }

}} 