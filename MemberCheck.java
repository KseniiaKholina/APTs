import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        // List<String> caught_ya = new ArrayList<>();
        Set<String> caught_ya = new HashSet<>();

        Map<String, Integer> Club_1 = new HashMap<>();
        Map<String, Integer> Club_2 = new HashMap<>();
        Map<String, Integer> Club_3 = new HashMap<>();

        for (String name_1 : club1) {
            int val = Club_1.getOrDefault(name_1, 0);
            Club_1.put(name_1, val + 1);
        }

        for (String name_2 : club2) {
            int val2 = Club_2.getOrDefault(name_2, 0);
            Club_2.put(name_2, val2 + 1);
        }

        for (String name_3 : club3) {
            int val3 = Club_3.getOrDefault(name_3, 0);
            Club_3.put(name_3, val3 + 1);
        }

        for (String name : Club_1.keySet()) {
            if (Club_2.containsKey(name) || Club_3.containsKey(name)) {
                caught_ya.add(name);
            }
        }

        for (String name_2 : Club_2.keySet()) {
            if (Club_1.containsKey(name_2) || Club_3.containsKey(name_2)) {
                caught_ya.add(name_2);
            }
        }

        for (String name_3 : Club_3.keySet()) {
            if (Club_1.containsKey(name_3) || Club_2.containsKey(name_3)) {
                caught_ya.add(name_3);
            }
        }

        String[] sortedArray = caught_ya.toArray(new String[0]);
        Arrays.sort(sortedArray);

        return sortedArray;
    }
}
