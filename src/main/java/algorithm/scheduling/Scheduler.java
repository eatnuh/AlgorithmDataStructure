package algorithm.scheduling;

public interface Scheduler {

    void addProcess(Process process);

    void proceed();
}
