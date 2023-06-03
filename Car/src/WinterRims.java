import java.awt.Color;
public class WinterRims extends WheelRims {
    private int height = 70;
    private int width = 70;
    public WinterRims(int x, int y) {
        super(x, y);
    }
    public void draw() {
        // Outer rim
        Drawing.pen().setColor(Color.BLUE);
        Drawing.pen().fillOval(x, y, width, height);

        // Inner rim
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillOval(x + 5, y + 5, width - 10, height - 10);

        // Highlight
        Drawing.pen().setColor(Color.CYAN);
        Drawing.pen().fillOval(x + 10, y + 10, width - 20, height - 20);
    }
}