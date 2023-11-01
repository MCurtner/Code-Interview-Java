import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 25;
        for (String s: solution(n)) {
            System.out.println(s);
        }
    }

    public static List<String> solution(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            // FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }

        return list;
    }
}
