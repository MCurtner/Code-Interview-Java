import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacter {

    public static void main(String[] args) {
        System.out.println(solution("Java"));
        System.out.println(solution("Java abba"));
    }

    public static String solution(String str) {
        if (str.isEmpty()) {
            return "None";
        }

        // Get string length
        int strLength = str.length();

        HashMap<Character, Integer> map = new HashMap<>();

        // Loop through string chars to check for duplicates
        for (int i = 0; i < strLength; i++) {
            char c = str.charAt(i);

            // If the map does not contain a char, add it.
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                // If is does already contain the key, increase the count value
                map.computeIfPresent(c, (k,v) -> v + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        // Iterate through the map for values greater than 1
        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > 1) {
                 sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}
