package state;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.clickPlay();
        player.clickNext();
        player.clickPlay();
        player.clickPlay();
        player.clickPrevious();
    }
}
