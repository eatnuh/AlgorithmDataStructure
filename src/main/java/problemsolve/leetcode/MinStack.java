package problemsolve.leetcode;

import java.util.Stack;

public class MinStack {

    private Stack<Element> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Element(val, val));
        } else {
            stack.push(new Element(Math.min(val, stack.peek().min), val));
        }

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }

    static class Element {
        int min;
        int val;

        public Element(int min, int val) {
            this.min = min;
            this.val = val;
        }
    }
}
