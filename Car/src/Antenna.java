import java.awt.*;

public class Antenna {
    private int x, y;
    private int height = 50;
    public Antenna(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw() {

        Drawing.pen().setColor(Color.GRAY);

        // draw antenna rod
        Drawing.pen().fillRect(x + 8, y, 4, height);

        // draw antenna ball
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillOval(x, y - 6, 20, 20);

        // draw antenna ball highlight
        Drawing.pen().setColor(new Color(255, 255, 255, 170));
        Drawing.pen().fillOval(x + 2, y - 4, 7, 7);

        // draw antenna ball shadow
        Drawing.pen().setColor(new Color(0, 0, 0, 60));
        Drawing.pen().fillOval(x + 8, y - 3, 10, 10);
    }
}
