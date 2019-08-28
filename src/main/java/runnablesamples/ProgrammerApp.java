package runnablesamples;

public class ProgrammerApp {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Thread thread = new Thread(programmer);
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println("main thread");
        }
        Thread t1 = new Thread(new TicketBoots(),"T1");
        Thread t2 = new Thread(new TicketBoots(),"T2");
        Thread t3 = new Thread(new TicketBoots(),"T3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());
    }
}
