package Problems;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        int count = 0;
        for(char c : s.toCharArray()){
            if (c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    count++;
                }else{
                    stack.pop();
                }
            }
        }


        return count + stack.size();
    }
}
