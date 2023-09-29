import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramChecker {

    public static void main(String[] args) {
        System.out.println(solution("Mary", "Army"));
    }

    public static boolean solution(String str1, String str2) {

        // If the length does not match then it is not an anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        List<Character> char1List = addToList(str1);
        List<Character> char2List = addToList(str2);

        return true;
    }

    public static List<Character> addToList(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        return list;
    }

}
