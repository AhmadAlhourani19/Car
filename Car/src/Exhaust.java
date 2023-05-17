import java.awt.*;

public class Exhaust {

    private int x;
    private int y;
    private int width = 15;
    private int height = 5;

    public Exhaust(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {

        Drawing.pen().setColor(Color.GRAY);
        Drawing.pen().fillRect(x, y, width, height);

        Drawing.pen().setColor(Color.LIGHT_GRAY);
        Drawing.pen().fillRect(x, y, width / 2, height);

        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawRect(x, y, width, height);
    }
}
