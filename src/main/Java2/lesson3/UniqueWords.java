package lesson3;

import java.util.HashMap;

public class UniqueWords {

    static String[] arr = {"First", "second", "SECOND", "third", "thirD", "fourth", "fifth", "sixth", "SIXth", "seventh", "eighTH", "ninth", "TENTH", "tenth"};

    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<>();
        for (String element : arr) {
            element = element.toLowerCase();
            words.merge(element, 1, Integer::sum);
        }
        words.forEach((k, v) -> System.out.println("'" + k + "' " + "count is " + v));
    }
}
