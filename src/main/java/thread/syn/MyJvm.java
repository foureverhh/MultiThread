package thread.syn;
/*
* 1.懒汉式
* 1）私有的构造器
* 2）静态的私有的实例
* 3）公开的访问静态的访问方法
* */
public class MyJvm {
    private static MyJvm instance = null;

    private MyJvm(){

    }

    public static MyJvm getInstance(){
        if(instance == null){
            synchronized (MyJvm.class){
                if(instance == null){
                    instance = new MyJvm();
                }
            }
        }
        return instance;
    }
}
/*
 *
 * */
class MyJvm1{
    private static MyJvm1 instance= new MyJvm1();

    private MyJvm1(){

    }

    public static MyJvm1 getInstance(){
        return instance;
    }
}

/*
*
* */
class MyJvm2{
    private static class JvmHolder{
        private static MyJvm2 instance= new MyJvm2();
    }

    private MyJvm2(){

    }

    public static MyJvm2 getInstance(){
        return JvmHolder.instance;
    }
}
