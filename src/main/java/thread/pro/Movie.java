package thread.pro;

/*One scenario collective resource
  Producer-Consumer pattern
  信号法
  wait()->等待，释放锁； sleep（）抱着锁睡觉
  notify（）/notifyAll():唤醒
* */
public class Movie {
    private String pic;
    //flag ->true  producer begin to produce,consumer waits,when product is ready to inform consumer
    //flag ->false consumer begin to consume,producer waits,when product is finished to inform producer
    private boolean flag = true;

    public synchronized void play(String pic){
        if(!flag){//生产者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Produce process
        try {
            Thread.sleep(500);
            System.out.println("生产了 "+pic);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Product is done
        this.pic = pic;
        //Inform consumer
        this.notify();
        //Producer to stop
        this.flag = false;
    }

    public synchronized void watch(){
        if(flag) {//Consumer waits
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Begin to consume
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //消费完毕
        System.out.println("消费了"+pic);
        //通知生产商
        this.notify();
        //Consumer to stop
        this.flag = true;
    }
}
