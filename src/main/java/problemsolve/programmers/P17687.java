package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/17687
public class P17687 {
    public String solution(int n, int t, int m, int p) {
        int sequenceLength = t * m;

        StringBuilder sequenceBuilder = new StringBuilder();
        sequenceBuilder.append(0);

        int num = 1;
        while(sequenceBuilder.length() < sequenceLength) {
            sequenceBuilder.append(toNRadix(n, num));
            num++;
        }

        StringBuilder tubeSequenceBuilder = new StringBuilder();

        for (int i = 0; i < t; i++) {
            tubeSequenceBuilder.append(sequenceBuilder.charAt(p - 1 + m * i));
        }

        return tubeSequenceBuilder.toString();
    }

    private String toNRadix(int n, int num) {
        if(num == 0) return "";

        int last = num % n;
        String lastToString;
        if(last == 10) lastToString = "A";
        else if(last == 11) lastToString = "B";
        else if(last == 12) lastToString = "C";
        else if(last == 13) lastToString = "D";
        else if(last == 14) lastToString = "E";
        else if(last == 15) lastToString = "F";
        else lastToString = Integer.toString(last);

        return toNRadix(n, num / n) + lastToString;
    }
}
