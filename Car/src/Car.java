import java.awt.*;

public class Car implements LocatedRectangle {
    private Body body; // composite
    private Lights lights; // composite
    private Roof roof; // composite
    private Wheel wheel; // composite
    private int x, y;
    private Color color;
    
    public Car(int x, int y, Color color) {
        body = new Body(x, y, color);
        roof = new Roof(x + 80, y);
        lights = new Lights(x,y);
        wheel = new Wheel(x,y);
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public void draw() {
        body.draw(x,y, color);
        lights.draw();
        roof.draw();
    }
    
	public Color getColor() {
		return this.color;
	}
    
    @Override
    public Point address() {
        return new Point(x, y - height());
    }

    @Override
    public int width() {
        int exhaust = 25;
        return body.width() + exhaust;
    }

    @Override
    public int height() {
        return body.height() + roof.height() + wheel.height();

    }
}