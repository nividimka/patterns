package strategy;

public class MultiplicationStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        System.out.println("Multiplication strategy executed");
        return a*b;
    }
}
