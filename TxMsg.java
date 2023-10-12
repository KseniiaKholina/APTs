import java.util.ArrayList;
import java.util.List;

public class TxMsg {
    List<String> newMessageList = new ArrayList<>();

    public boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) >= 0;
    }

    public String getMessage(String original) {
        String[] originalSplit = original.split(" ");

        for (String word : originalSplit) {
            StringBuilder abbreviatedWord = new StringBuilder();
            boolean hasConsonant = false;

            for (int k = 0; k < word.length(); k++) {
                char currentChar = word.charAt(k);
                if (!isVowel(currentChar)) {
                    abbreviatedWord.append(currentChar);
                    hasConsonant = true;
                } else if (hasConsonant) {
                    abbreviatedWord.append(currentChar);
                }
            }

            newMessageList.add(abbreviatedWord.toString());
        }

        return String.join(" ", newMessageList);
    }
}


//  import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

// public class TxMsg {
//     List<String> new_message_array = new ArrayList<>();
//     List<Character> wordChars = new ArrayList<>();
//     private boolean isVowel(char ch) {
//         return "aeiou".indexOf(ch) >= 0;
//         // String[] vowels = {"a", "e", "i", "o", "u"};
//         // List<String> vowelList = Arrays.asList(vowels);

//     }
//     public String getMessage(String original) {
//         String[] original_split = original.split(" ");
//         String[] vowels = {"a", "e", "i", "o", "u"};
//         List<String> vowelList = Arrays.asList(vowels);

//         for (String word : original_split) {
//             StringBuilder abbreviatedWord = new StringBuilder();

//             for (int k=1; k <  word.length(); k++) {
           
//                 if (!isVowel(word.charAt(k)) && !isVowel(word.charAt(k-1))) {
//                     abbreviatedWord.append(word.charAt(k));
//                 }
//                 if (vowelList.containsAll(Arrays.asList(word.toCharArray()))) {
//                     abbreviatedWord.append(word);
//                 }
//             }
//         new_message_array.add(abbreviatedWord.toString());

//         }
//         return String.join(" ", new_message_array);
//       }

// }