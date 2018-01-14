package proxy;

public class Client {
    public static void main(String[] args) {
        iMath math = new MathLoggingProxy();
        math.add(4, 2);
        math.sub(4, 2);
        math.mul(4, 2);
        math.div(4, 2);
    }
}
