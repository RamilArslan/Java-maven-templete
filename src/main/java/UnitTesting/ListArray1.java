package UnitTesting;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayListExample
{
public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(5,4,3,8,9));

        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(7,6,5,4,3));


        listOne.addAll(listTwo);

        listOne.remove(0);
        listOne.remove(0);
        listOne.remove(0);

        System.out.println(listOne);
        }
        }