import java.util.HashMap;

public class Anonymous {
    HashMap<Character, Integer> myMap = new HashMap<>();
    int[] amap = new int[256];

    public int howMany(String[] headlines, String[] messages) {
        int ret = 0;
        createMap(headlines);
        for (String m : messages) {
            if (canMake(m)) {
                ret += 1;
            }
        }
        return ret;
    }

    private void createMap(String[] headlines) {
        for (String title : headlines) {
            for (char ch : title.toLowerCase().toCharArray()) {
                int val = myMap.getOrDefault(ch, 0);
                myMap.put(ch, val + 1);
                amap[ch] += 1;
            }
        }
    }

    private boolean canMake(String m) {
        m = m.toLowerCase();
        int[] local = new int[256]; 
        for (char ch : m.toCharArray()) {
            local[ch] += 1;
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (local[ch] > myMap.getOrDefault(ch, 0)) {
                return false;
            }
        }
        return true;
    }
}
