package state;

public class PausedState extends State{
    public PausedState(Player player) {
        super(player);
    }

    @Override
    public void play() {
        player.stopPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void next() {
        player.nextSong();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void previous() {
        player.previousSong();
        player.changeState(new PlayingState(player));
    }
}
