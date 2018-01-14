package factory_method;

public class PhoneForm extends  AbstractForm {
    @Override
    public AbstractWriter createWriter() {
       return new PhoneWriter();
    }
}
