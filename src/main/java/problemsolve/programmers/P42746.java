package problemsolve.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

// https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class P42746 {
    public String solution(int[] numbers) {

        Arrays.stream(numbers).boxed().map(integer -> Integer.toString(integer)).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1Index = 0;
                int o2Index = 0;

                while(o1Index < o1.length() && o2Index < o2.length()) {

                }

                return 0;
            }
        });



        String answer = "";
        return answer;
    }

}
