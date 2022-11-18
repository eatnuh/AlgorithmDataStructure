package problemsolve.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class P42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Job> jobQueue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            jobQueue.add(new Job(progresses[i], speeds[i]));
        }

        int deployNum = 0;
        int day = 0;
        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();

            if (day < job.getDay()) {
                answerList.add(deployNum);
                day = job.getDay();
                deployNum = 1;
            } else {
                deployNum++;
            }
        }
        answerList.add(deployNum);
        int[] answer = new int[answerList.size() - 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i + 1);
        }
        return answer;
    }

    static class Job {
        private int progress;
        private int speed;

        public Job(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public int getDay() {
            int remain = 100 - progress;
            return (remain / speed) + ((remain % speed != 0) ? 1 : 0);
        }

    }
}
