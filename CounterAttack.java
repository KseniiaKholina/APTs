public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] splitWords = str.split(" ");
        int[] result = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            int countWord = 0;
            for (int k = 0; k < splitWords.length; k++) {
                if (words[i].equals(splitWords[k])) {
                    countWord += 1;
                }
            }
            result[i] = countWord;
        }

        return result;
    }
}
