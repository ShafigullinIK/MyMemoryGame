package model;

public class Timer implements Runnable {

    private int time;
    private int frequency = 100;
    private int sleepTime = 1000 / frequency;

    public Timer(int time) {
        this.time = time * frequency;
    }

    public void add(int addTime){
        time += addTime * frequency;
    }

    @Override
    public void run() {
        while (time > 0){
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {

            }
            time--;
        }
    }

    public int getTime() {
        return time;
    }
}
