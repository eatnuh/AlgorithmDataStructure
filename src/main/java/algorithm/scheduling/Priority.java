package algorithm.scheduling;

import java.util.PriorityQueue;

// schedule by priority
public class Priority implements Scheduler {

    private final PriorityQueue<Process> waitQueue;

    public Priority() {
        this.waitQueue = new PriorityQueue<>((o1, o2) -> o2.getPriority() - o1.getPriority());
    }

    @Override
    public void addProcess(Process process) {
        waitQueue.add(process);
    }

    @Override
    public void proceed() {
        if (!waitQueue.isEmpty()) waitQueue.poll().proceed();
    }
}
