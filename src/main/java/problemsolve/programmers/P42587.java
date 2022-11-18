package problemsolve.programmers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class P42587 {
    public int solution(int[] priorities, int location) {
        Queue<PrintRequest> printer = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for(int i = 0; i < priorities.length; i++) {
            printer.add(new PrintRequest(priorities[i], i));
            priorityQueue.add(priorities[i]);
        }
        int order = 1;
        while(!printer.isEmpty()) {
            PrintRequest request = printer.poll();
            int priority = priorityQueue.peek();
            if(request.priority == priority) {
                priorityQueue.poll();
                if(request.location == location) return order;
                else order++;

            } else {
                printer.add(request);
            }
        }
        return -1;
    }

    static class PrintRequest {
        private int priority;
        private int location;

        public PrintRequest(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
}
