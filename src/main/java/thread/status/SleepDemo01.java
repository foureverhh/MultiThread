package thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemo01 extends Thread {
    //Count down 10 seconds
    //private static int count = 10;
    public static void main(String[] args) throws InterruptedException {
        /*
        //Count down 10 seconds
        int num = 10;
        System.out.println("Count down "+num+" seconds");
        while (num-->0) {
            Thread.sleep(1000);
            System.out.println(num + " seconds left!");
        }*/
        //count down time
        Date endTime = new Date(System.currentTimeMillis()+10*1000);
        long end = endTime.getTime();
        while(true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            Thread.sleep(1000);
            endTime = new Date(endTime.getTime()-1000);
            if(end - 10000 > endTime.getTime()){
                break;
            }
        }
        /*
        System.out.println("Count down "+count+" seconds");
        SleepDemo01 sleepDemo01 = new SleepDemo01();
        Thread thread = new Thread(sleepDemo01);
        thread.start();
        */
    }

    @Override
    public void run() {

        /*while(count>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;

            if(count > 0){
                System.out.println(count+" left");

            }else {
                System.out.println("Done");
            }
        }*/
    }
}

