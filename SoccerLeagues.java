import java.util.*;


public class SoccerLeagues {
     public int[] points(String[] matches) {
        int[] scores = new int[matches.length];
        for (int i = 0; i < matches.length; i++) {
            for (char ch : matches[i].toCharArray()) {
                if (ch =='W') {
                    scores[i] += 3;
                }
                if (ch == 'D') {
                    scores[i] += 1;
                }
                if (ch == 'L') {
                    scores[i] += 0;
                }
            }
            for (String match : matches) {
                if (match.charAt(i) == 'L') {
                    scores[i] += 3;
                }
                if (match.charAt(i) == 'D') {
                    scores[i] += 1;
                }
                if (match.charAt(i) == 'W') {
                    scores[i] += 0;
                }

            }
        }
        return scores;
     }
 }

