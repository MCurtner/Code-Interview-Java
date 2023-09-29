import java.util.ArrayList;
import java.util.List;

public class Fib {
    public static void main(String[] args) {
        solution(10);
    }

    public static void solution(int num) {
        int firstNum = 0;
        int secondNum = 1;

        List<Integer> fibList = new ArrayList<>();
        fibList.add(secondNum);

        while (fibList.size() < num) {
            int temp = firstNum + secondNum;
            fibList.add(temp);

            firstNum = secondNum;
            secondNum = temp;
        }

        System.out.println(fibList);
    }
}
