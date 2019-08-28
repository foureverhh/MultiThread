package callablesamples;

import java.util.concurrent.*;

public class Call {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Use ExecutorService and Executors to create callable thread
        ExecutorService service = Executors.newFixedThreadPool(2);
        //实现类对象
        Race turtle = new Race("Turtle",1000);
        Race rabbit = new Race("Rabbit",500);

        //Get a Future type call back
        Future<Integer> result1 = service.submit(turtle);
        Future<Integer> result2 = service.submit(rabbit);


        Thread.sleep(2000);
        turtle.setFlag(false);
        rabbit.setFlag(false);

        int num1 = result1.get();
        int num2 = result2.get();
        System.out.println("Turtle--> "+num1+", Rabbit--> "+num2);

        //Shutdown ExecutorService
        service.shutdownNow();

    }
}

class Race implements Callable<Integer>{
    private String name;
    private long time; //Latency time
    private boolean flag = true;
    private int step = 0;

    public Race(){
    }

    public Race(String name){
        this();
        this.name = name;
    }

    public Race(String name,long time){
        this(name);
        this.time = time;
    }

    @Override
    public Integer call() throws Exception {
        while(flag){
            Thread.sleep(time);//latency
            step++;
        }
        return step;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }

    public boolean isFlag() {
        return flag;
    }

    public int getStep() {
        return step;
    }
}
