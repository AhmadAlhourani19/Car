import java.awt.*;

public class Frontlight {
    private int x, y;
    private int width = 30, height = 30;
    private Color color = new Color(255, 255, 200);
    public Frontlight(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw() {
        // Draw frontlight
        Drawing.pen().setColor(color);
        Drawing.pen().fillOval(x, y, width, height);

        // Draw light beam
        Drawing.pen().setColor(new Color(255, 255, 200, 75));
        Drawing.pen().fillArc(x - 100, y - 100, width + 200, height + 200, 130, 90);
    }
}
