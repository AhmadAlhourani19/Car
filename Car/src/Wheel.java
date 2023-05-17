import java.awt.Color;

public class Wheel {
    private int x,y;
    public Wheel(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw() {
        // draw the wheel
        Drawing.pen().setColor(Color.white);
        Drawing.pen().fillOval(x, y, 100, 100);

        // draw the tire
        Drawing.pen().setColor(Color.black);
        Drawing.pen().fillOval(x + 10, y + 10, 80, 80);

        // draw the rim
        Drawing.pen().setColor(Color.gray);
        Drawing.pen().fillOval(x + 20, y + 20, 60, 60);

    }
}
