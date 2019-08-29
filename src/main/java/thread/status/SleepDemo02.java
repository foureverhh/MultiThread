package thread.status;

//Sleep as network latency
public class SleepDemo02 {
    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        //Just thead start
        Thread t1 = new Thread(web12306,"A");
        Thread t2 = new Thread(web12306,"B");
        Thread t3 = new Thread(web12306,"C");

        t1.start();
        t2.start();
        t3.start();



    }

}
