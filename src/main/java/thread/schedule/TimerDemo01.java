package thread.schedule;
/*
* timer.schedule(TimerTask task, Date time);
* timer.schedule(TimerTask task, Date time, long period);
* */

// quartz
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("So easy...");
            }
        },1000,200);
    }
}
