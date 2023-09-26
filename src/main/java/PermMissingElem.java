import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] array = {2,3,1,5};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {
        int count = A.length;

        if (count == 0) {
            return 1;
        }

        int gsum = ((count + 1) * ((count + 1) + 1)) / 2;
        int sum = Arrays.stream(A).reduce(0, Integer::sum);

        System.out.println(gsum);
        System.out.println(sum);

        return gsum - sum;
    }
}
