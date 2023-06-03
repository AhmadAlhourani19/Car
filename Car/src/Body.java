import java.awt.*;

public class Body {
    private int x, y;
    private int width = 500;
    private int height = 350;
    private Wheel leftWheel;   // composite
    private Wheel rightWheel;   // composite
    private Antenna antenna;   // composite
    private Exhaust exhaust;   // composite
    private Door leftDoor;   // composite
    private Door rightDoor;   // composite
    private Mirror mirror;   // composite
    private WinterRims leftWinterRim; //composite
    private WinterRims rightWinterRim; //composite
    
    public Body(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        leftWheel = new Wheel(x + 60, y + 50);
        rightWheel = new Wheel(x + 350, y +50);
        antenna = new Antenna(x + 445,y -50 );
        exhaust = new Exhaust(x + 510, y +75);
        leftDoor = new Door(x + 170,y +5);
        rightDoor = new Door(x + 260, y +5);
        mirror = new Mirror(x +130, y+ 20);
        leftWinterRim = new WinterRims(x + 75, y + 65);
        rightWinterRim = new WinterRims(x + 365, y +65);
        System.out.println("Body::Body: " + x + " " + y );

    }

    public void draw(int x, int y, Color color) {
        int roofHeight = height / 2;
        int bodyHeight = height - roofHeight;
        // draw body
        Drawing.pen().setColor(color);
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
        leftWinterRim.draw();
        rightWinterRim.draw();
    }

    public int width() {
        return width;
    }

    public int height() {
        return height / 5;
    }
}
