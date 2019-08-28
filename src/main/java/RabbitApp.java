public class RabbitApp {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.start();//Not to invoke run(),but start()
        Turtle turtle = new Turtle();
        turtle.start();

        for(int i= 0; i<1000;i++) {
            System.out.println("main==> " + i);
        }
    }
}
