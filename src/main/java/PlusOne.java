import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0})));
        System.out.println(Arrays.toString(solution(new int[]{1,2,3})));
        System.out.println(Arrays.toString(solution(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(solution(new int[]{9})));
        System.out.println(Arrays.toString(solution(new int[]{9,8,7,6,5,4,3,2,1,0})));
        System.out.println(Arrays.toString(solution(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));
    }

    public static int[] solution(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
