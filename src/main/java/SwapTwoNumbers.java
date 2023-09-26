public class SwapTwoNumbers {

    public static void main(String[] args) {
        System.out.println(solution(1, 4));

        System.out.println(solution(22, 53));

        System.out.println(solution(-8, 23));
    }

    public static int solution(int x, int y) {
        // Get the sum of both numbers and assign to x
        x = x + y;

        // Get the difference of the new X - y;
        y = x - y;

        // Subtract the new x from the new y;
        x = x - y;

        return x;
    }
}
