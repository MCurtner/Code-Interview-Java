import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] array = {9,3,9,3,9,7,9};

        System.out.println(solution(array));
    }

    public static int solution(int[] A) {

        int arrayCount = A.length;

        // Nothing to do if there is nothing in the array.
        if (arrayCount < 1) {
            return 0;
        }

        if (arrayCount == 1) {
            return A[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayCount; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        System.out.println(map);

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                return e.getKey();
            }
        }

        return 1;
    }
}
