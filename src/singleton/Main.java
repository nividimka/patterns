package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().getVersion());
        Singleton.getInstance().setVersion("12.2.1");
        System.out.println(Singleton.getInstance().getVersion());
    }
}
