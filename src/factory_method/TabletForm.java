package factory_method;

public class TabletForm extends AbstractForm {
    @Override
    public AbstractWriter createWriter() {
        return new TabletWriter();
    }
}
