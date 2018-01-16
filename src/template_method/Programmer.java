package template_method;

public class Programmer extends Worker{
    @Override
    protected void work() {
        System.out.println("programmer write code");
    }
}
