package problemsolve.programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class P42577 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
            String before = phone_book[i];
            String after = phone_book[i + 1];

            if(after.startsWith(before)) return false;

        }
        return true;
    }
}
