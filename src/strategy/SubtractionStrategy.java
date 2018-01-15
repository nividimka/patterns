package strategy;

public class SubtractionStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        System.out.println("Subtraction strategy executed");
        return a-b;
    }
}

