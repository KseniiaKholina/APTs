import java.util.*;
// import java.util.Set;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        int total_score = 0;
        Set<String> unique_player = new HashSet<>(Arrays.asList(player));
        
        for (String i : unique_player) {
            for (String m : dictionary) {
                if (i.equals(m)) {
                    total_score += i.length() * i.length();
                }
            }
        }

        return total_score; 
    }

    // public static void main(String[] args) {
       
    // }
}
