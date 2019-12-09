package model;

public class Timer implements Runnable {

    private int time;

    public Timer(int time) {
        this.time = time;
    }

    public void add(int addTime){
        time += addTime;
    }

    @Override
    public void run() {
        while (time > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            time--;
        }
    }
}
