package app;


import java.util.*;
import java.util.stream.IntStream;

public class Lesson11_01 {
    public static void main(String[] args) {
        String origin = "Hello World";

        HashMap<Character, List<Integer>> map = new HashMap<>();

        IntStream.range(0, origin.length()).forEach(i -> {
            char c = origin.charAt(i);
            List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
            positions.add(i);
            map.put(c, positions);
        });

        map.entrySet().stream().sorted(Comparator.comparingInt(o -> o.getValue().size())).forEach(c ->
                System.out.printf("Letter: '%c':%d:%s\n", c.getKey(), c.getValue().size(),c.getValue()));
    }
}



