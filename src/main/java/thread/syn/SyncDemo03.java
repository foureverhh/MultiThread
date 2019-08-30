package thread.syn;

public class SyncDemo03 {
    public static void main(String[] args) {
        Object g = new Object();
        Object m = new Object();

        Test t = new Test(g,m);
        Test2 t2 = new Test2(g,m);
        Thread proxy = new Thread(t);
        Thread proxy1 = new Thread(t2);
        proxy.start();
        proxy1.start();
    }
}

class Test implements Runnable{
    Object goods;
    Object money;

    public Test(Object goods,Object money){
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        while (true){
            test();
        }
    }

    public void test()  {
        synchronized (this.goods){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this.money){

            }
        }
        System.out.println("Give money!");
    }
}

class Test2 implements Runnable{
     Object goods;
     Object money;

     public Test2(Object goods,Object money){
         this.goods = goods;
         this.money = money;
     }

    @Override
    public void run() {
        while (true){
            test();
        }
    }

    public void test()  {
        synchronized (this.money){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this.goods){

            }
        }
        System.out.println("Give goods!");
    }
}
