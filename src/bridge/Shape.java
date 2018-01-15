package bridge;

public abstract class Shape {
    public Drawer drawer;

    public Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();
}
