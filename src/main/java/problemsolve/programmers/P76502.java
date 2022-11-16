package problemsolve.programmers;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/76502
public class P76502 {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (check(s.substring(i) + s.substring(0, i))) answer++;
        }

        return answer;
    }

    private boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                switch (c) {
                    case ')':
                        if (stack.pop() != '(') return false;
                        break;
                    case '}':
                        if (stack.pop() != '{') return false;
                        break;
                    case ']':
                        if (stack.pop() != '[') return false;
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.isEmpty();

    }


}
