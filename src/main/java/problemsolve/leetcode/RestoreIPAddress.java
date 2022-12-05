package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {
    public List<String> restoreIpAddresses(String s) {
        List<Integer> temp = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        restore(s, temp, answer, 0);

        return answer;
    }

    private void restore(String s, List<Integer> temp, List<String> answer, int start) {
        if(temp.size() == 4) {
            if(start != s.length()) return;
            answer.add(temp.get(0) + "." + temp.get(1) + "." + temp.get(2) + "." + temp.get(3));
        }

        for(int i = 1; i <= 3; i++) {
            if (start + i > s.length()) return;
            int num = Integer.parseInt(s.substring(start, start + i));
            if(isValid(num, i)) {
                temp.add(num);
                restore(s, temp, answer, start + i);
                temp.remove(temp.size() - 1);
            }
        }

    }

    private boolean isValid(int num, int cnt) {
        if(cnt == 1) return 0 <= num && num <= 9;
        if(cnt == 2) return 10 <= num && num <= 99;
        if(cnt == 3) return 100 <= num && num <= 255;
        return false;
    }
}
