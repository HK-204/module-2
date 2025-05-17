public class StopWatch {
    private long startTime, endTime;
    private boolean running = false;

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        running = false;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public boolean isRunning() {
        return running;
    }
}
