package thread.syn;

import thread.status.Web12306;

public class SynDemo01 {
    public static void main(String[] args) throws InterruptedException {
        Web12306 web12306 = new Web12306();
        Thread t1 = new Thread(web12306,"T111");
        Thread t2 = new Thread(web12306,"T222");
        Thread t3 = new Thread(web12306,"T333");

        t1.start();
        t2.start();
        t3.start();
        //Thread.sleep(200);


    }
}
