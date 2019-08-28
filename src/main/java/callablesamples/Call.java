package callablesamples;

import java.util.concurrent.*;

public class Call {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Use ExecutorService and Executors to create callable thread
        ExecutorService service = Executors.newFixedThreadPool(1);
        //实现类对象
        Race tortoise = new Race();
        //Get a Future type call back
        Future<Integer> result = service.submit(tortoise);
        int num = result.get();
        System.out.println(num);

        //Shutdown ExecutorService
        service.shutdown();

    }
}

class Race implements Callable<Integer>{
    private String name;
    private int time;

    private boolean flag = true;

    @Override
    public Integer call() throws Exception {
        return 1000;
    }
}
