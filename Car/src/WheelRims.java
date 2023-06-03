import java.awt.Color;

public class WheelRims extends CarComponent {
    private int height = 50;
    private int width = 50;
    public WheelRims(int x, int y) {
        super(x, y);
    }
    @Override
    public void draw() {
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillOval(x, y, width, height);

        Drawing.pen().setColor(Color.GRAY);
        Drawing.pen().fillOval(x + 5, y + 5, width - 10, height - 10);
    }
}