import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            // if the value of the char at  i is greater than the next char, add it to total.
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                total += map.get(s.charAt(i));
            } else {
                // else subtract it from total
                total -= map.get(s.charAt(i));
            }
        }

        return total + map.get(s.charAt(s.length() - 1));
    }
}
