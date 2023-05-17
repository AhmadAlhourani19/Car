import java.awt.*;

public class Blinker {
    private int x, y;
    private int width = 14, height = 7;
    private Color color = new Color(255, 215, 0);

    public Blinker(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        // Draw blinker
        Drawing.pen().setColor(color);
        Drawing.pen().fillOval(x, y, width, height);

        // Draw highlight
        Drawing.pen().setColor(new Color(255, 255, 255, 50));
        Drawing.pen().fillOval(x + 5, y + 5, width/2, height/2);
    }
}
