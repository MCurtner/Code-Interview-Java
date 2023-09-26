public class Factorial {

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(10));
        System.out.println(solution(-5));
        System.out.println(solution(2));
    }

    public static long solution(int num) {

        if (num < 0) {
            return -9999;
        }

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }


        return result;
    }
}
