import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public class FirstUnique {

    public static void main(String[] args) {
        int[] A = {4, 10, 5, 4, 2, 10};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        HashSet<Integer> unique = new LinkedHashSet<>();
        //HashSet<Integer> nonUnique = new LinkedHashSet<>();

        for (int num: A) {
            if (unique.contains(num)) {
                unique.remove(num);
                //nonUnique.add(num);
            } else {
                unique.add(num);
            }
        }

        try {
            return unique.iterator().next();
        } catch (NoSuchElementException e) {
            return -1;
        }
    }
}
