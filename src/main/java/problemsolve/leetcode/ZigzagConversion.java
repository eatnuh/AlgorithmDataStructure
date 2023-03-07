package problemsolve.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigzagConversion {

    private final static int UP = 0;
    private final static int DOWN = 1;
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int row = 0;
        int dir = DOWN;

        List<Character>[] lists = new List[numRows];

        for(int i = 0; i < numRows; i++) {
            lists[i] = new ArrayList<>();
        }

        for(int i = 0; i < s.length(); i++) {
            lists[row].add(s.charAt(i));
            if(row == 0) {
                dir = DOWN;
            } else if(row == numRows - 1) {
                dir = UP;
            }

            if(dir == DOWN) row++;
            else row--;

        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < lists.length; i++) {
            lists[i].forEach(c -> sb.append(c));
        }

        return sb.toString();
    }

}
