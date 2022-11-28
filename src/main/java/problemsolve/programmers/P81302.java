package problemsolve.programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/81302
public class P81302 {

    private static final int ROOM_SIZE = 5;

    private static final char PERSON = 'P';
    private static final char EMPTY_TABLE = 'O';
    private static final char PARTITION = 'X';

    private static final int VALID = 1;
    private static final int INVALID = 0;

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for(int i = 0; i < places.length; i++) {
            answer[i] = isValid(places[i])? VALID : INVALID;
        }
        return answer;
    }

    private boolean isValid(String[] place) {
        return false;
    }

        
}
