import java.awt.Color;

public class SportRims extends WheelRims {
    private int width = 60;
    private int height = 60;
    public SportRims(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        Drawing.pen().setColor(Color.RED);
        Drawing.pen().fillOval(x, y, width, height);

        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillOval(x + 5, y + 5, width - 10, height - 10);

        Drawing.pen().setColor(Color.YELLOW);
        Drawing.pen().fillOval(x + 10, y + 10, width - 20, height - 20);
    }
}