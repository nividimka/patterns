package prototype;

public class Square extends Shape{
    public Square(int width) {
        super(width,width);
    }

    @Override
    public Shape clone() {
        return new Square(width);
    }
}
