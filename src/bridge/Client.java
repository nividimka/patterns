package bridge;

public class Client {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Image(new LargeImageDrawer(),10,10,20,20),
                new Image(new SmallImageDrawer(),10,10,20,20)
        };
        for (Shape shape: shapes) {
            shape.draw();
        }
    }

}
