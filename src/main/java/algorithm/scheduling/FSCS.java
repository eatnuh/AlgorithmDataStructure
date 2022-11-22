package algorithm.scheduling;

import java.util.LinkedList;
import java.util.Queue;

// first in first out
public class FSCS implements Scheduler {

    private final Queue<Process> waitQueue;

    public FSCS() {
        this.waitQueue = new LinkedList<>();
    }

    @Override
    public void addProcess(Process process) {
        this.waitQueue.add(process);
    }

    @Override
    public void proceed() {
        if (!waitQueue.isEmpty()) waitQueue.poll().proceed();
    }
}
