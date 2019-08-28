package thread.status;

public class Demo01 {
    public static void main(String[] args) {
        Study study = new Study();
        Thread thread = new Thread(study);
        thread.start();
        for(int i=0;i<100;i++){
            if(i==10){
                study.setFlag(false);
            }
            System.out.println("Main --> "+i);
        }

    }
}

class Study implements Runnable{
    private boolean flag = true;

    @Override
    public void run() {
        while(flag){
            System.out.println("Study thread ...");
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
