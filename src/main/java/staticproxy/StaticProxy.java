package staticproxy;
/*
* 真实角色
* 代理角色:持有真实代理的角色
* 二者实现相同接口
* */
public class StaticProxy {
    public static void main(String[] args) {
        TrueMan trueMan = new TrueMan();
        ProxyGuy proxyGuy = new ProxyGuy(trueMan);
        proxyGuy.marry();
    }
}

interface Marry{
    void marry();
}

class TrueMan implements Marry{

    @Override
    public void marry() {
        System.out.println("True man marries!");
    }
}

class ProxyGuy implements Marry{

    private Marry trueman;

    public ProxyGuy() {

    }

    public ProxyGuy(Marry trueman) {
        this.trueman = trueman;
    }

    private void before(){
        System.out.println("Proxy prepare");
    }
    private void after(){
        System.out.println("Proxy clean");
    }
    @Override
    public void marry() {
        before();
        trueman.marry();
        after();
    }
}