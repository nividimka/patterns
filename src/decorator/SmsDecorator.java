package decorator;

public class SmsDecorator extends BaseDecorator {
    public SmsDecorator(iNotification notification) {
        super(notification);
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("Sms decorator notify:" + text);
    }
}
