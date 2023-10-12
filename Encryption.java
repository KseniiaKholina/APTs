import java.util.*;

public class Encryption {
    public String encrypt(String message) {
        Map<Character, Character> myMap = new HashMap<>();
        char[] alphabet1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // Find unique characters in the message
        Set<Character> messChar = new LinkedHashSet<>();
        for (char x : message.toCharArray()) {
            messChar.add(x);
        }

        int i = 0;
        for (char y : messChar) {
            char alphabetChar = alphabet1[i++];
            myMap.put(y, alphabetChar);
        }

        StringBuilder newMessage = new StringBuilder();
        char[] characters = message.toCharArray();
        for (char ch : characters) {
            char alph = myMap.getOrDefault(ch, ch);
            newMessage.append(alph);
        }

        return newMessage.toString();
    }
}
   

    //    public class Encryption {
    //    public String encrypt(String message){
    //     Map<Character, Character> myMap = new HashMap<>();
    //     char[] alphabet1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
       

    //     for (int i = 0; i < message.length(); i++) {
    //         char messageChar = message.charAt(i);
    //         char alphabetChar = alphabet1[i];
    //                     if (!myMap.containsKey(messageChar)) {
    //             myMap.put(messageChar, alphabetChar);
    //         }
    //     }
     

    //     StringBuilder new_message = new StringBuilder();
    //     char[] characters = message.toCharArray();
    //     for (char ch : characters) {
    //         char alph = myMap.getOrDefault(ch, ch);
    //         new_message.append(alph);

    //         }

    //     return new_message.toString();

    //     }
        
    //    }
   