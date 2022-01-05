package homework.chapter09.Q06;

public class Q06Stopwatch {

    private long startTime;
    private long endTime;

    public Q06Stopwatch() { this.startTime = System.currentTimeMillis(); }

    void start() { startTime = System.currentTimeMillis(); }

    void stop() { endTime = System.currentTimeMillis(); }

    long getElapsedTime() { return (getEndTime() - getStartTime()); }

    public long getStartTime() { return startTime; }

    public long getEndTime() { return endTime; }
}
