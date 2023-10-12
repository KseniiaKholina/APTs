import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        Set<String> uniqueWords = new LinkedHashSet<>(); // Using LinkedHashSet to preserve order
        for (String word : list) {
            if (word.length() >= minLength) {
                uniqueWords.add(word);
            }
        }
        List<String> filteredList = new ArrayList<>(uniqueWords);
        String[] result = new String[filteredList.size()];
        result = filteredList.toArray(result);

        return result;
    }
}
