package proxy;

public class MathLoggingProxy implements iMath{
    Math math;

    public MathLoggingProxy() {
        this.math = new Math();
    }

    @Override
    public int add(int x, int y) {
        int res = math.add(x,y);
        System.out.println(x + " + " + y + " = " + res);
        return res;
    }

    @Override
    public int sub(int x, int y) {
        int res = math.sub(x, y);
        System.out.println(x + " - " + y + " = " + res);
        return res;
    }

    @Override
    public int mul(int x, int y) {
        int res = math.mul(x, y);
        System.out.println(x + " * " + y + " = " + res);
        return res;
    }

    @Override
    public int div(int x, int y) {
        int res = math.div(x,y);
        System.out.println(x + " / " + y + " = " + res);
        return res;
    }
}
