package factory_method;

import java.util.Random;

public class Client {
    AbstractForm form;
    AbstractWriter writer;
    public Client() {
        int l = new Random().nextInt();
        this.form = new TabletForm();
        writer = form.createWriter();
        writer.writeHello();
    }

    public static void main(String[] args) {
        new Client();
    }
}
