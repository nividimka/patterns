package decorator;

public class Client {
    public static void main(String[] args) {
        iNotification notificator = new Notificator();
        iNotification facebookDecorator = new FacebookDecorator(notificator);
        iNotification smsDecorator = new SmsDecorator(facebookDecorator);
        smsDecorator.notify("blabla");
    }
}
