import java.awt.*;

public class Roof {
    private int x, y;
    private int width = 350;
    private int height = 150;
    private int roofHeight;
    private int[] xPoints;
    private int[] yPoints;

    public Roof(int x, int y) {
        this.x = x;
        this.y = y;
        this.roofHeight = height / 4;
        this.xPoints = new int[] {x, x + width, x + width, x + width / 2, x};
        this.yPoints = new int[] {y, y, y - roofHeight, y - height / 2, y - roofHeight/2};
    }

    public void draw() {
        // Draw the roof
        Drawing.pen().setColor(Color.BLUE);
        Drawing.pen().fillPolygon(xPoints, yPoints, 5);


    }
    public int width() {
        return width;
    }

    public int height() {
        return height /2;
    }
}
