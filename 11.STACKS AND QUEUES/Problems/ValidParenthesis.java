package Problems;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println((char) 92);
        System.out.println((int) '(' + " " + (int) ')');
        System.out.println((int) '[' + " " + (int) ']');
        System.out.println((int) '{' + " " + (int) '}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{' ) {
                        return false;
                    }
                }
                if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                }
                if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
