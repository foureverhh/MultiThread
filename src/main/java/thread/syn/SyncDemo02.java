package thread.syn;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/* Singleton 单例设计模式：确保一个类只有一个对象，从一个类的内部创建
*
* */
public class SyncDemo02 {
    public static void main(String[] args) {
        JvmThread jvm1 = new JvmThread(100);
        JvmThread jvm2 = new JvmThread(500);
        Thread proxy1 = new Thread(jvm1);
        Thread proxy2 = new Thread(jvm2);

        proxy1.start();
        proxy2.start();

        /*
        Jvm jvm1 = Jvm.getInstance();
        Jvm jvm2 = Jvm.getInstance();
        System.out.println(jvm1 == jvm2);
        */
    }


}
/*
* 单例设计模式
* 确保一个类只有一个对象
* 懒汉式
* 1.构造器私有化，避免外部直接创建对象
* 2.声明一个私有的静态变量
* 3.创建一个对外的公共的静态方法访问该变量，如果变量没有对象，创建该对象
*
* */
class Jvm{
    //私有的静态变量
    private static Jvm instance = null;
    //Constructor private 构造器私有化
    private Jvm(){

    }
    //创建一个对外的公共的静态方法访问该变量，如果变量没有对象，创建该对象
    public static Jvm getInstance(long time) throws InterruptedException {
        if(instance == null){
            Thread.sleep(time);
            instance = new Jvm();
        }
        return instance;
    }
}

class JvmThread implements Runnable{

    private long time;

    public JvmThread(long time){
        this.time = time;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" creates "+Jvm.getInstance(time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}