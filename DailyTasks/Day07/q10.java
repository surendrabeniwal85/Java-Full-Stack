package DailyTasks.Day07;

// Task: Word Frequency Counter using HashMap

import java.util.HashMap;

public class q10 {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");

        for (String word : frequency.keySet()) {
            System.out.println(word + " : " + frequency.get(word));
        }
    }
}
