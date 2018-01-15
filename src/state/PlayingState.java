package state;

public class PlayingState extends State{

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public void play() {
        player.stopPlayback();
        player.changeState(new PausedState(player));
    }


    @Override
    public void next() {
        player.nextSong();
    }

    @Override
    public void previous() {
        player.previousSong();
    }
}
