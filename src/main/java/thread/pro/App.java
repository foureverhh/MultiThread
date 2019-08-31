package thread.pro;

public class App {
    public static void main(String[] args) {
        //共同的资源
        Movie movie = new Movie();

        //Multi-thead
        Player player = new Player(movie);
        Watcher watcher = new Watcher(movie);

        new Thread(player).start();
        new Thread(watcher).start();
    }
}
