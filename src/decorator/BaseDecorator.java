package decorator;

public class BaseDecorator implements iNotification {
    iNotification notification;

    public BaseDecorator(iNotification notification) {
        this.notification = notification;
    }

    @Override
    public void notify(String text) {
        notification.notify(text);
    }
}
