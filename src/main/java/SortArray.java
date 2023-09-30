public class SortArray {

    public static void main(String[] args) {
        int[] arr = {12, 134,1, 19, 32, 50};

        // Loop over two arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
