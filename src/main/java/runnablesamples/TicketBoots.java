package runnablesamples;

public class TicketBoots implements Runnable  {
    private int tickets = 50;
    @Override
    public void run() {
        while(tickets>0){
            System.out.println("Only "+tickets--+" tickets left");
        }
        System.out.println("Ticket sold out!");
        System.out.println(Thread.currentThread().getName()+" get "+tickets+" ticket");

    }


}
