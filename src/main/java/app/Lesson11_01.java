package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Lesson11_01 {
    public static void main(String[] args) {
        String origin = "Hello World";
        TreeMap<Character, List<Integer>> map = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return String.valueOf(o1).toLowerCase().compareTo(String.valueOf(o2).toLowerCase());
            }
        });
        //      HashMap<Character, List<Integer>> map = new HashMap<>();


        IntStream.range(0, origin.length()).forEach(i -> {
            char c = origin.charAt(i);
            List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
            positions.add(i);
            map.put(c, positions);
        });

        map.forEach((c, n) ->
                System.out.printf("Letter: '%c':%d:%s\n", c, n.size(),n));
        System.out.println();
    }
}



