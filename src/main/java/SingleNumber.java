import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,2,3}));
        System.out.println(solution(new int[] {4,1,2,1,2}));
        System.out.println(solution(new int[] {1}));
    }

    public static int solution(int[] nums) {
        // Hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }


        return 0;
    }
}
