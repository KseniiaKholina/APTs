import java.util.*;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        char nucleotide = nuc.charAt(0);
        int maxOccurrences = 0;
        String winnerStrand = " ";
        int[] counts = new int[strands.length];

        for (String strand : strands) {
            int count = 0;
            for (char ch : strand.toCharArray()) {
                if (ch == nucleotide) {
                    count++;
                }
            }
          
            if ((count > maxOccurrences) || (count == maxOccurrences && strand.length() > winnerStrand.length())) {
                maxOccurrences = count;
                winnerStrand = strand;
            }
            

         
        }

        return winnerStrand;
    }
}
