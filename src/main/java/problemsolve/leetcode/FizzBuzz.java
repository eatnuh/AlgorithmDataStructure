package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String element = "";
            if (i % 3 == 0) element += "Fizz";
            if (i % 5 == 0) element += "Buzz";
            if (i % 3 != 0 && i % 5 != 0) element = Integer.toString(i);
            answer.add(element);
        }

        return answer;
    }
}
