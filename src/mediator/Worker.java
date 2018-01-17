package mediator;

public abstract class Worker {

    protected Chatable chatable;

    public Worker(Chatable chatable) {
        this.chatable = chatable;
    }

    public void send(String message) {
        chatable.send(message, this);
    }

    public abstract void notify(String from,String message);
}