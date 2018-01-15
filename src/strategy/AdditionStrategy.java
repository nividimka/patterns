package strategy;

public class AdditionStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        System.out.println("Addition Strategy executed");
        return a+b;
    }
}
