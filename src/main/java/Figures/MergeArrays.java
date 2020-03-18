package Figures;

import java.util.Arrays;
import java.util.Random;

    public class MergeArrays {
        public static void main(String[] args) {
            int[] data1 = new Random().ints(10, 30).limit(20).sorted().toArray();
            int[] data2 = new Random().ints(10, 30).limit(20).sorted().toArray();
            int[] data3 = merge(data1, data2);
            System.out.println(Arrays.toString(data1));
            System.out.println(Arrays.toString(data2));
            System.out.println(Arrays.toString(data3));
        }

        private static int[] merge(int[] data1, int[] data2) {
            int fal = data1.length;
            int sal = data2.length;
            int[] result = new int[fal+sal];
            System.arraycopy(data1, 0, result, 0, fal);
            System.arraycopy(data2, 0, result, fal, sal);
            System.out.println(Arrays.toString(result));
            return result;
        }
    }



