package mediator;

public class Chat extends Chatable {

    private Programmer programmer;
    private Manager manager;

    public void setProgrammer(Programmer programmer) {
        this.programmer = programmer;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void send(String message, Worker worker) {
        if (worker.equals(manager)) {
            programmer.notify("manager",message);
        } else {
            manager.notify("programmer",message);
        }
    }
}