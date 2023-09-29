import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    public static boolean solution(int num) {
        //
        String numStr = String.valueOf(num);

        // Get the total number of digits
        int length = numStr.length();

        // Store digits in list
        List<Integer> digitList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            digitList.add(digit);
        }

        // Calculate the pow of the digit and add to total
        int total = 0;
        for (int digit : digitList) {
            total += (int) Math.pow(digit, length);
        }

        return total == num;
    }
}
