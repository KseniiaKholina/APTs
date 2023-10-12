import java.util.HashMap;
import java.util.Map;

public class BigWord {
    public String most(String[] sentences) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (String sentence : sentences) {
            String[] words = sentence.toLowerCase().split(" ");

            for (String word : words) {
                int frequency = wordFrequency.getOrDefault(word, 0) + 1;
                wordFrequency.put(word, frequency);

                if (frequency > maxFrequency) {
                    maxFrequency = frequency;
                    mostFrequentWord = word;
                }
            }
        }

        return mostFrequentWord;
    }
}