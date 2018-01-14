package factory_method;

public class TabletWriter extends AbstractWriter {
    @Override
    public void writeHello() {
        System.out.println("hello client from tablet");
    }
}
