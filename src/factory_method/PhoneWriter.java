package factory_method;

public class PhoneWriter extends AbstractWriter {
    @Override
    public void writeHello() {
        System.out.println("hello from phone");
    }
}
