package strategy;

public class Client {
    public static void main(String[] args) {
        Composition composition = new Composition();
        composition.setStrategy(new AdditionStrategy());
        int result1 = composition.execute(1,5);
        composition.setStrategy(new MultiplicationStrategy());
        int result2 = composition.execute(1,5);
        composition.setStrategy(new SubtractionStrategy());
        int result3 = composition.execute(1,5);
        System.out.println("addition result " + result1);
        System.out.println("multiplication result " + result2);
        System.out.println("subtraction result " + result3);
    }
}
