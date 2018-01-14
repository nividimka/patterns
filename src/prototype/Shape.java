package prototype;

public abstract class Shape {
    int width;
    int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract Shape clone();
}
