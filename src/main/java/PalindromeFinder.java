import java.util.ArrayList;
import java.util.List;

public class PalindromeFinder {

    public static void main(String[] args) {
        System.out.println(solution("This is a madam"));
        System.out.println(solution("This is no palindrome here"));
        System.out.println(solution("Man the radar madam"));
    }

    public static String solution(String inputStr) {
        // Split up string from spaces.
        String[] strArr = inputStr.split(" ");

        // remove all single characters.
        List<String> stringList = new ArrayList<>();
        for (String item: strArr) {
            if (item.length() != 1) {
                stringList.add(item);
            }
        }

        // Check if it is a palindrome
        List<String> palidromes = new ArrayList<>();
        for (String word : stringList) {
            if (word.equalsIgnoreCase(reverseWord(word))) {
                palidromes.add(word);
            }
        }

        if (!palidromes.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String palindrome : palidromes) {
                sb.append(palindrome).append(" ");
            }

            return sb.toString();
        } else {
            return "No palindromes found.";
        }

    }

    private static String reverseWord(String inputStr) {
        StringBuilder sb = new StringBuilder(inputStr);
        return sb.reverse().toString();
    }
}
