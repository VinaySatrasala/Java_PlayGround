package Problems;

import java.util.Stack;

public class MinimumInsertionstoBalanceaParenthesesString {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))(()))()())))"));
    }

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                stack.push(c[i]);
            } else {
                if (!stack.isEmpty()) {
                    if (i < c.length - 1) {
                        if (c[i] == c[i + 1]) {
                            i++;
                        } else {
                            count++;
                        }
                    } else {
                        count++;
                    }
                    stack.pop();
                } else {
                    if (i < c.length - 1) {
                        if (c[i] == c[i + 1]) {
                            i++;
                            count++;
                        } else {
                            count+=2;
                        }
                    } else {
                        count+=2;
                    }
                }
            }
        }
        System.out.println(stack.size());
        return count + stack.size()*2;
    }
}
