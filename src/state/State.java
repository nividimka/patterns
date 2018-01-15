package state;

public abstract class State {
    Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract void play();
    public abstract void next();
    public abstract void previous();
}
