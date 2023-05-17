import java.awt.*;

public class Mirror {
    private int x, y;
    private int width = 20;
    private int height = 20;
    private Color color = new Color(120, 120, 120);

    public Mirror(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        // Draw mirror
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillRect(x, y, width, height);

        // Draw the mirror glass
        Drawing.pen().setColor(Color.LIGHT_GRAY);
        Drawing.pen().fillRect(x + 2, y + 2, width - 4, height - 4);

        // Draw the highlight on the top edge of the mirror
        Drawing.pen().setColor(Color.WHITE);
        Drawing.pen().fillRect(x + 2, y + 2, width - 4, 2);
    }
}
