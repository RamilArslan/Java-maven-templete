package UnitTesting;
import java.util.Arrays;

public class ListArray {
    public static void main(String[] args) {
        int [] a = new int[10];
        int [] b = new int[10];
        for (int i = 0; i <a.length; i++) {
            a[i] = (int) (Math.random()*20-10);
        }

        for (int i = 0; i <b.length ; i++) {
            b[i]= (int)(Math.random()*25-10);
        }
        String aStringRep = Arrays.toString(a);
        String bStringRep = Arrays.toString(b);
        System.out.println(aStringRep + bStringRep);

        }
    }

