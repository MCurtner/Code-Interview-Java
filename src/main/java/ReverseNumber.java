public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static int solution(int num) {

        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(reversed == num);

        return reversed;
    }
}
