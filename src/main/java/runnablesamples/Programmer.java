package runnablesamples;

public class Programmer implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
        System.out.println("instance of programmer");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println();
    }

}
