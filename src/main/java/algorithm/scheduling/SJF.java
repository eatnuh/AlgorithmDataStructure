package algorithm.scheduling;

import java.util.Comparator;
import java.util.PriorityQueue;

// shortest job first
public class SJF implements Scheduler {

    private final PriorityQueue<Process> waitQueue;

    public SJF() {
        this.waitQueue = new PriorityQueue<>(Comparator.comparingInt(Process::getExecuteTime));
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
