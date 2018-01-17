package decorator;

public class FacebookDecorator extends BaseDecorator{
    public FacebookDecorator(iNotification notification) {
        super(notification);
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("facebookDecorator notify:" + text);
    }
}
