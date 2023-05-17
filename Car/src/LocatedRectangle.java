import java.awt.Point;

public interface LocatedRectangle {
    public Point address () ;
    public int width();
    public int height () ;
    public boolean intersects (LocatedRectangle other);
}
