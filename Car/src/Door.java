import java.awt.*;

public class Door {
    private int x, y;
    private int width = 75;
    private int height = 80;
    private Seat leftSeat; // composite
    private Seat rightSeat; // composite
    private Window window; // composite
    public Door(int x, int y) {
        this.x = x;
        this.y = y;

        leftSeat = new Seat(x+ 40,y + 20);
        rightSeat = new Seat(x+ 40,y + 20);
        window = new Window(x + 5,y + 30);
    }

    public void draw() {
        // Draw main door
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillRect(x, y, width, height);

        // Draw highlights
        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillRect(x + 5, y + 5, width - 10, height / 2);
        Drawing.pen().fillRect(x + 5, y + height / 2, width - 10, height / 4);

        // Draw door handle
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillOval(x + width - 60, y + height / 2 - 20, 5, 5);
        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillOval(x + width - 55, y + height / 2 - 15, 4, 4);

        leftSeat.draw();
        rightSeat.draw();
        window.drawWithCurtains();
    }
}
