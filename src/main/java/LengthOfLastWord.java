public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(solution("Hello World"));
        System.out.println(solution("   fly me   to   the moon  "));
        System.out.println(solution("luffy is still joyboy"));
    }

    public static int solution(String s) {
        String[] arrStr = s.split(" ");
        String lastWord = arrStr[arrStr.length - 1];

        return lastWord.length();
    }
}
