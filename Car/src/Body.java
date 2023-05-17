import java.awt.*;

public class Body {
    private int x, y;
    private int width = 500;
    private int height = 350;
    private Wheel leftWheel;
    private Wheel rightWheel;
    private Antenna antenna;
    private Exhaust exhaust;
    private Door leftDoor;
    private Door rightDoor;
    private Mirror mirror;

    public Body(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        leftWheel = new Wheel(x + 60, y + 50);
        rightWheel = new Wheel(x + 350, y +50);
        antenna = new Antenna(x + 445,y -50 );
        exhaust = new Exhaust(x + 510, y +75);
        leftDoor = new Door(x + 170,y +5);
        rightDoor = new Door(x + 260, y +5);
        mirror = new Mirror(x +130, y+ 20);
    }

    public void draw() {
        int roofHeight = height / 2;
        int bodyHeight = height - roofHeight;
        // draw body
        Drawing.pen().setColor(Color.RED);
        Drawing.pen().fillRect(x, y, width, bodyHeight/2);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().fillRect(x - 10, y + bodyHeight - 108, 20, 20);
        Drawing.pen().fillRect(x + width - 10, y + bodyHeight - 108, 20, 20);

        leftWheel.draw();
        rightWheel.draw();
        antenna.draw();
        exhaust.draw();
        leftDoor.draw();
        rightDoor.draw();
        mirror.draw();
    }
}
