package app;

import java.util.*;
import java.util.stream.IntStream;

public class Lesson11 {
    public static void main(String[] args) {
        String origin = "Hello World";
        TreeMap<Character, List<Integer>> map = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return String.valueOf(o1).toLowerCase().compareTo(String.valueOf(o2).toLowerCase());
            }
        });


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


