import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {


    public static void main(String[] args) {
        System.out.println(solution("{}"));
        System.out.println(solution("[]"));
        System.out.println(solution("()"));

        System.out.println(solution("("));
        System.out.println(solution("(((}{["));
    }

    public static boolean solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '[':
                case '(':
                case '{':
                    stack.push(c);
                    break;
                case ']':
                    if (stack.empty() || !stack.pop().equals('[')) {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.empty() || !stack.pop().equals('(')) {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || !stack.pop().equals('{')) {
                        return false;
                    }
                    break;
            }
        }

        return stack.empty();
    }
}
