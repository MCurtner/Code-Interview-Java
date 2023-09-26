public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(solution(543));
    }

    public static int solution(int num) {

        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
