package problemsolve.programmers;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42888
public class P42888 {
    public String[] solution(String[] record) {
        List<String> answerList = new ArrayList<>();
        Map<String, String> uidToNickName = new HashMap<>();

        for (String r : record) {
            StringTokenizer st = new StringTokenizer(r);
            String cmd = st.nextToken();
            if (cmd.equals("Enter") || cmd.equals("Change")) {
                String uid = st.nextToken();
                String nickName = st.nextToken();
                uidToNickName.put(uid, nickName);
            }
        }

        for (String r : record) {
            StringTokenizer st = new StringTokenizer(r);
            String cmd = st.nextToken();
            String uid = st.nextToken();
            if (cmd.equals("Enter")) {
                answerList.add(uidToNickName.get(uid) + "님이 들어왔습니다.");
            } else if (cmd.equals("Leave")) {
                answerList.add(uidToNickName.get(uid) + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

}
