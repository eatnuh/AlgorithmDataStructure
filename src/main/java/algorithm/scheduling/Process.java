package algorithm.scheduling;

public class Process {

    private final long pid;
    private final int priority;
    private int executeTime;

    public Process(long id, int executeTime, int priority) {
        this.pid = id;
        this.executeTime = executeTime;
        this.priority = priority;
    }

    public long getPid() {
        return pid;
    }

    public int getExecuteTime() {
        return executeTime;
    }

    public int getPriority() {
        return priority;
    }

    public void proceed() {
        System.out.println("Proceed");
        System.out.println("pid : " + pid);
        System.out.println("executeTime : " + executeTime);
        System.out.println("priority : " + priority);

        executeTime = 0;
    }

    public void proceed(int time) {
        System.out.println("Proceed");
        System.out.println("pid : " + pid);
        System.out.println("executeTime : " + (time > executeTime ? executeTime : time));
        System.out.println("remainingTime : " + (time > executeTime ? 0 : executeTime - time));
        System.out.println("priority : " + priority);

        executeTime = time > executeTime ? 0 : executeTime - time;
    }

    public boolean isFinish() {
        return executeTime == 0;
    }
}
