package mediator;

public class Manager extends Worker {

    public Manager(Chatable chatable) {
        super(chatable);
    }

    @Override
    public void notify(String from, String message) {
        System.out.println("Manager gets message:\"" + from + ": " + message + "\"");
    }
}