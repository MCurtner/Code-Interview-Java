import java.util.Arrays;

public class TripletArray {

    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};
        System.out.println(solution(arr, 9));

        int[] arr1 = {12, 3, 4, 1, 6,9};
        System.out.println(solution(arr1, 24));

        System.out.println(solution(arr1, 100));
    }

    public static boolean solution(int[] arr, int sum) {
        // Sort array
        Arrays.sort(arr);


        if (arr.length < 3) {
            // No triplets
            return false;
        }

        int total = 0;
        // check element against all other elements to get expected sum.
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 1; j < arr.length - 1; j++) {

                int fVal = arr[i];
                int sVal = arr[j];
                int tVal = arr[j + 1];

                total = fVal + sVal + tVal;
                if (total == sum) {
                    System.out.println("Triplet is: " + arr[i] + ", " + arr[j] + ", " + arr[j + 1]);
                    return true;
                }
            }
        }

        return false;
    }
}
