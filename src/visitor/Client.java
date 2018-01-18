package visitor;

public class Client {

    public static void main(String[] args) {

        Point p = new Point2d(1, 2);
        Visitor v = new Chebyshev();
        p.accept(v);
        System.out.println(p.getMetric());
    }
}
