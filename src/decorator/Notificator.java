package decorator;

public class Notificator implements iNotification {
    @Override
    public void notify(String text) {
        System.out.println("notificator notify");
    }
}
