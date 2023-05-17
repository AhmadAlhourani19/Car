import java.awt.*;

public class Headlight {
    private int x, y;
    private int width = 30, height = 30;
    private Color color = new Color(255, 255, 200);
    public Headlight(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw() {
        Drawing.pen().setColor(Color.RED);
        Drawing.pen().fillRect(x, y, width, height);

        // draw inner light
        Drawing.pen().setColor(Color.ORANGE);
        Drawing.pen().fillRect(x + 5, y + 5, width - 10, height - 10);

        // Draw light beam
        Drawing.pen().setColor(new Color(255, 255, 200, 75));
        Drawing.pen().fillArc(x - 100, y - 100, width + 200, height + 200, -45, 90);
    }
}
