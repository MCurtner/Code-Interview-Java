import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] arr = {3,8,9,7,6};
        System.out.println(Arrays.toString(solution(arr, 3)));
    }

    public static int[] solution(int[] A, int K) {

        // Nothing to be done, return array.
        if (K == 0) {
            return A;
        }

        List<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        Collections.rotate(list, K);

        return list.stream().mapToInt(i -> i).toArray();
    }

}
