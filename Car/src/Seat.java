import java.awt.*;

public class Seat {
    private int x, y;
    private int width = 30;
    private int height = 40;

    public Seat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        // Draw the seat
        Drawing.pen().setColor(Color.GRAY);
        Drawing.pen().fillRect(x, y, width, height);

        // Draw the highlights
        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillRect(x, y + height/4, width/2, height/2);
        Drawing.pen().fillRect(x + width/2, y + height/4, width/2, height/2);
        Drawing.pen().fillRect(x + width/4, y + height/4, width/2, height/2);

        // Draw the borders
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawRect(x, y, width, height);
        Drawing.pen().drawRect(x + 1, y + 1, width - 2, height - 2);
    }
}
