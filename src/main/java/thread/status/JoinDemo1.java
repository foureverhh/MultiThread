package thread.status;

public class JoinDemo1 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        JoinDemo1 joinDemo1 = new JoinDemo1();
        Thread thread = new Thread(joinDemo1); //Create
        thread.start();                        //Thread ready to go

        for (int i=0;i<100;i++){
            if(i==50){
                thread.join();
            }
            System.out.println("Main...."+i);
        }

    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("Join...."+i);
        }
    }
}
