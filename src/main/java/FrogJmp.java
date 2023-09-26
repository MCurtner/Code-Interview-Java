public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        double jumps = (double) (Y - X) / (double) D;

        return (int) Math.ceil(jumps);
    }
}
