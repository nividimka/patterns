package adapter;

public class Client {
    public static void main(String[] args) {
        Chief chiefAdapter = new ChiefAdapter();
        chiefAdapter.makeBreakfast();
    }
}
