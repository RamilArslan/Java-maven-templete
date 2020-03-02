package app;

import java.util.ArrayList;
import java.util.Arrays;
public class SentenceStructure {

    private static void createSentence(ArrayList<String> subjects, ArrayList<String> verbs, ArrayList<String> objects) {
        for (String subject : subjects) {
            for (String verb : verbs) {
                for (String object : objects) {
                    System.out.println(subject + " " + verb + " " + object);
                }
            }
        }
    }
        public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<String>(Arrays.asList("Noel", "The cat", "The dog"));
        ArrayList<String> verbs =new ArrayList<String>(Arrays.asList("wrote", "chased", "slept on"));
        ArrayList<String> objects =new ArrayList<String>(Arrays.asList("the book","the ball","the bed"));

        ArrayList<String> sentences = new ArrayList<>();
                createSentence(subjects, verbs, objects);
    }

    }



