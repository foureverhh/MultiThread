package thread.info;

public class InfoDemo01 {
    /*
    * Thread.currentThread().getName();
    * thread.setName();
    * thread.getName();
    * thread.isAlive();
    * */
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        Thread proxy = new Thread(t1);
        proxy.setName("Test Thread");
        System.out.println(proxy.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Before start, proxy is "+proxy.isAlive());
        proxy.start();
        System.out.println("After start, proxy is "+proxy.isAlive());
        Thread.sleep(200);
        t1.stop();
        System.out.println("After t1 called stop, proxy is "+proxy.isAlive());
        Thread.sleep(200);
        System.out.println("200 millisecond after t1 called stop, proxy is "+proxy.isAlive());
    }

}
