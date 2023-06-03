import java.awt.*;

public class Wheel {
    private int x,y;
    private int width = 100;
    private int height = 100;
    public Wheel(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw() {
        // draw the wheel
        Drawing.pen().setColor(Color.white);
        Drawing.pen().fillOval(x, y, width, height);

        // draw the tire
        Drawing.pen().setColor(Color.black);
        Drawing.pen().fillOval(x + 10, y + 10, 80, 80);

        // draw the rim
        Drawing.pen().setColor(Color.gray);
        Drawing.pen().fillOval(x + 20, y + 20, 60, 60);

    }
    public int height() {
        return height;
    }
    public int width() {
        return width;
    }
}
