import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
public class Scene {
    private List<Car> cars;

    public Scene() {
        cars = new ArrayList<>();
        // add cars to the scene
        cars.add(new Car(100, 100));
        cars.add(new Car(300, 200));
        cars.add(new Car(500, 300));
    }

    public void draw() {
        for (Car car : cars) {
            if (!intersects(car)) {
                car.draw();
            }
        }
    }

    public boolean intersects(Car car) {
        Rectangle thisRect = new Rectangle(car.address().x, car.address().y, car.width(), car.height());
        for (Car other : cars) {
            if (car != other) {
                Rectangle otherRect = new Rectangle(other.address().x, other.address().y, other.width(), other.height());
                if (thisRect.intersects(otherRect)) {
                    return true;
                }
            }
        }
        return false;
    }
}