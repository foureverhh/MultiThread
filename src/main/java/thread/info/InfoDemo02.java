package thread.info;
/*Priority 只代表概率，不代表绝对先后顺序
* MAX_PRIORITY
* MIN_PRIORITY
* NORM_PRIORITY
*
* setPriority()
* getPriority()
* */
public class InfoDemo02 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        MyThread it1 = new MyThread();
        Thread p1 = new Thread(it1,"IT one");
        MyThread it2 = new MyThread();
        Thread p2 = new Thread(it2,"IT two");

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();

        Thread.sleep(100);

        it1.stop();
        it2.stop();
    }
    @Override
    public void run() {

    }
}
