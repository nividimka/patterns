package state;

public class Player {
    State state;

    public Player() {
        changeState(new PlayingState(this));
    }

    public void startPlayback() {
        System.out.println("start playback");
    }

    public void stopPlayback(){
        System.out.println("stop playback");
    }


    public void changeState(State state) {
        System.out.println("state changed to" + state.getClass().getSimpleName());
        this.state = state;
    }

    public void clickPlay() {
        System.out.println("play clicked");
        state.play();
    }

    public void clickNext() {
        System.out.println("next clicked");
        state.next();
    }

    public void clickPrevious() {
        System.out.println("previous clicked");
        state.previous();
    }

    public void nextSong() {
        System.out.println("next song");
    }

    public void previousSong() {
        System.out.println("previous song");
    }
}
