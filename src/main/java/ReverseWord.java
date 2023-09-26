import java.util.ArrayList;
import java.util.List;

public class ReverseWord {

    public static void main(String[] args) {

        System.out.println(solution2("TEST"));
        System.out.println(solution2("THIS is a test string"));
    }

    public static String solution(String inputStr) {
        StringBuilder sb = new StringBuilder(inputStr);
        return sb.reverse().toString();
    }

    public static String solution2(String inputStr) {

        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < inputStr.length(); i++) {
            characterList.add(inputStr.charAt(i));
        }

        StringBuilder output = new StringBuilder();
        for (int i = characterList.size() - 1; i >= 0 ; i--) {
            output.append(characterList.get(i));
        }

        return output.toString();
    }
}
