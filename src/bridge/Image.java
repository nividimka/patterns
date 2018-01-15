package bridge;

public class Image extends Shape{
    int x;
    int y;
    int width;
    int height;
    public Image(Drawer drawer,int x,int y, int width,int height) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        drawer.draw(x,y,width,height);
    }
}
