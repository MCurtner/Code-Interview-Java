import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
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

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(map.get(s.charAt(i)));
        }

        int total = 0;
        for (int number : list) {
            total += number;
        }

        return total;
    }
}
