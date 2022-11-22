package algorithm.scheduling;

import java.util.LinkedList;
import java.util.Queue;

// use time-slice
public class RoundRobin implements Scheduler {

    private static final int TIME_SLICE = 5;

    private final Queue<Process> waitQueue;

    public RoundRobin() {
        this.waitQueue = new LinkedList<>();
    }

    @Override
    public void addProcess(Process process) {
        this.waitQueue.add(process);
    }

    @Override
    public void proceed() {
        if (waitQueue.isEmpty()) return;

        Process process = waitQueue.poll();
        process.proceed(TIME_SLICE);

        if (process.isFinish()) return;

        waitQueue.add(process);
    }
}
