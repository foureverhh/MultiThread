package thread.status;

public class YieldDemo01 extends Thread {

    public static void main(String[] args) {
        YieldDemo01 yieldDemo01 = new YieldDemo01();
        Thread thread = new Thread(yieldDemo01);
        thread.start();

        for(int i = 0;i<1000;i++){
            if(i%20==0){
                //Pause the main thread
                Thread.yield();
            }
        }
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Yield ... "+i);
        }
    }
}
