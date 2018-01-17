package mediator;

public class Programmer extends Worker {

    public Programmer(Chatable chatable) {
        super(chatable);
    }

    @Override
    public void notify(String from,String message) {
        System.out.println("Programmer gets message:\"" + from + ": " + message + "\"");
    }
}
