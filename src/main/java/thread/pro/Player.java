package thread.pro;

public class Player implements Runnable{
    private Movie movie;

    public Player(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            if(i%2 ==0){
                movie.play("Produced Odd Number，and i is: "+i);
            }else {
                movie.play("Produced Even Number,and i is: "+i);
            }
        }
    }
}
