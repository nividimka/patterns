package template_method;

public class Manager extends Worker {
    @Override
    protected void work() {
        System.out.println("Manager sitting at room");
    }
}
