package IO;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class PrintSentence {
    private static void write(List<String> lines, String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String line : lines) {
            bw.write(line);
            bw.write("\n");
        }
        bw.close();
    }

    private static List<String> read (String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        return br.lines().collect(Collectors.toList());
    }

    public static void main (String[]args) throws FileNotFoundException {
        Map<String, List<String>> map1 = new HashMap<>();
        Map<String, List<String>> map2 = new HashMap<>();
        String file1 = "subj_verb.txt";
        String file2 = "verb_obj.txt";
        readAndFillToMap(map1,file1);
        readAndFillToMap(map2,file2);

        for (String skey: map1.keySet()) {
            for (String verb: map1.get(skey)) {
                for (String obj: map2.get(verb)) {
                    System.out.println(skey + " " + verb + " " + obj);
                }
            }
        }


        System.out.println();

    }

    private static void readAndFillToMap(Map<String, List<String>> map, String name) throws FileNotFoundException {
        List<String> listOfSentence = read(name);
        for (String s : listOfSentence) {
            String[] splittedList = s.split(":");
            String[] arrTwo = splittedList[1].split(",");
            List<String> list = new ArrayList<>();
            Collections.addAll(list, arrTwo);
            map.put(splittedList[0], list);
        }
    }
}

