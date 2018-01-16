package template_method;

public class Client {
    public static void main(String[] args) {
        new Manager().dailyRoutine();
        new Programmer().dailyRoutine();
    }
}
