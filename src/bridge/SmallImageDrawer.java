package bridge;

public class SmallImageDrawer implements Drawer{
    double scale = 0.5;
    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("Small image with x = " + x + " and y = " + y + " coordinates and width = " + width*scale + ", height = " + height*scale);
    }
}
