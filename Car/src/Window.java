import java.awt.Color;

public class Window {
    private int x, y;
    private int width = 65;
    private int height = 30;
    public Window(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillRect(x, y, width, height);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawRect(x, y, width, height);
    }

    public void drawWithCurtains() {
        Drawing.pen().setColor(Color.RED);
        Drawing.pen().fillRect(x + 10, y + 10, width - 20, height - 20);
    }

    public void drawWithBlinds() {
        for (int i = 0; i < height; i += 10) {
            Drawing.pen().setColor(Color.GRAY);
            Drawing.pen().fillRect(x, y + i, width, 5);
        }
    }

    public void drawWithBars() {
        Drawing.pen().setColor(Color.BLACK);
        for (int i = 0; i < width; i += 20) {
            Drawing.pen().fillRect(x + i, y + height / 2 - 5, 10, 10);
        }
    }

    public void drawRandomVariation() {
        int randomNumber = RandomNumber.between(1, 3);

        switch (randomNumber) {
            case 1:
                drawWithCurtains();
                break;
            case 2:
                drawWithBlinds();
                break;
            case 3:
                drawWithBars();
                break;
            default:
                draw(); // Default variation
                break;
        }
    }
}
