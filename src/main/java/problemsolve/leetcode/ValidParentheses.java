package problemsolve.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isOpen(c)) stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                if(!isValid(stack.peek(), c)) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isValid(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
