import java.util.*;

public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {

        List<Integer> list = new ArrayList<>();

        for (Integer num : nums) {
            if (num != val) {
                list.add(num);
            }
        }

        return list.size();
    }
}
