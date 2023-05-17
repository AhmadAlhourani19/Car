import java.awt.*;

public class Car implements LocatedRectangle {
    private Body body;
    private Lights lights;
    private Roof roof;
    private int x, y;
    private int width = 80;
    private int height = 50;

    public Car(int x, int y) {
        body = new Body(x, y);
        roof = new Roof(x + 80, y);
        lights = new Lights(x,y);
        this.x = x;
        this.y = y;
    }

    public void draw() {
        body.draw();
        lights.draw();
        roof.draw();
    }

    public Point address() {
        return new Point(x, y);
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }
    public boolean intersects(LocatedRectangle other) {
        return !doesNotIntersect(other, 0);
    }

    public boolean intersects(LocatedRectangle other, int margin) {
        return !doesNotIntersect(other, margin);
    }

    private boolean doesNotIntersect(LocatedRectangle other, int margin) {
        return 	leftOf(other, margin) || rightOf(other, margin) ||
                above(other, margin) || below(other, margin);
    }

    public boolean leftOf(LocatedRectangle other, int margin){
        return this.address().x + this.width() + margin < other.address().x;
    }

    public boolean rightOf(LocatedRectangle other, int margin){
        return this.address().x > other.address().x + other.width() + margin;
    }

    private boolean above(LocatedRectangle other, int margin) {
        return this.address().y + this.height() - margin <= other.address().y;
    }

    private boolean below(LocatedRectangle other, int margin) {
        return this.address().y >= other.address().y + other.height() - margin;
    }
}
