public class Rabbit extends Thread {
    //override run function run(线程体)
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Rabbit has run "+i+" steps.");
        }
    }
}
