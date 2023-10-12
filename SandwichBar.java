import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders) {
        List<String> availableIngredients = Arrays.asList(available);
        
        for (int i = 0; i < orders.length; i++) {
            String[] order_split = orders[i].split(" ");
            List<String> order_list = Arrays.asList(order_split);
            
            if (availableIngredients.containsAll(order_list)) {
                return i;
            }
        }
        
        return -1; // Return -1 if no sandwich can be made.
    }
}
