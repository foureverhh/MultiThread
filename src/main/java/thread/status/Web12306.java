package thread.status;

public class Web12306 implements Runnable {
    private int tickets = 10;
    private boolean flag = true;
    @Override
    public void run() {
        while(flag){
            test3();
        }
        /*
           while(tickets-->0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" get "+tickets+" .");
        }*/
    }
    //thread safe with synchronized block
    //thread safe
    public void test3(){
        synchronized(this){
            if(tickets<=0){
                flag = false;
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " get " + tickets-- + " .");
        }
    }

    //thread safe with synchronized method
    public synchronized void test2(){
        if(tickets<=0){
            flag=false;
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" get "+tickets--+" .");
    }

    //Not thread safe
    public void test1(){
        if(tickets<=0){
            flag=false;
        }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName()+" get "+tickets--+" .");
    }


}
