package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square(3));
        shapeList.add(new Rectangle(4, 2));
        shapeList.add(new Square(10));

        List<Shape> tempList = new ArrayList<>();
        for (Shape shape : shapeList) {
            tempList.add(shape.clone());
        }
        for (Shape shape : tempList) {
            System.out.println(shape.getClass().getSimpleName() + ": height = " + shape.height + " and width = " + shape.width);
        }
    }
}
