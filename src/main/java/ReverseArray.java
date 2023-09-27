import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(input)));
    }

    public static int[] solution(int[] arr) {
        // Create a temp arr the same size of the input array.
        int[] temp = new int[arr.length];

        // Iterate over the input array and add to temp array
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[idx] = arr[i];
            idx++;
        }

        return temp;
    }
}
