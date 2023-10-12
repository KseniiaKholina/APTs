import java.util.HashSet;
import java.util.Set;

public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;
        Set<String> unique = new HashSet<>();
        for(String k : words) {
            unique.add(k);
        }
        String[] unique_array = unique.toArray(new String[0]);
        
        for(String i : unique_array) {

        
            if(first.charAt(0) == i.charAt(0)) {
                count += 1;
            }
            else {
                count += 0;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        
    }
}