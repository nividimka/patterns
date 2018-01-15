package bridge;

public class LargeImageDrawer implements Drawer{
    double scale = 3;
    @Override
    public void draw(int x, int y, int width, int height) {
        System.out.println("Large image with x = " + x + " and y = " + y + " coordinates and width = " + width*scale + ", height = " + height*scale);
    }
}
