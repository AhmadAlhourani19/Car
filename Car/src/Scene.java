import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class Scene {
	private ArrayList<LocatedRectangle> sceneObjects = null;
	
    public Scene() {
		sceneObjects = new ArrayList<LocatedRectangle>();
		
        for (int i = 0; i < 1; i++) {
        	Random random = new Random();
        	int x = random.nextInt(1000);
        	int y = random.nextInt(600);
            Car newCar = new Car(x, y, Color.BLACK );
            boolean intersects = false;

            if (!intersects) {
            	sceneObjects.add(newCar);
            }
        }
    }
    
	private void addObject(LocatedRectangle newObject) {
		boolean intersection = false;
		
		for (LocatedRectangle m : sceneObjects) {
			intersection = intersection || m.intersects(newObject);
		}
		if (!intersection) {
			sceneObjects.add(newObject);
		}
	}

	public void draw() {
		for (LocatedRectangle o : sceneObjects) {
			if (o.getClass() == Car.class) {
				((Car)o).draw();
			} 
		}
	}
    public void setRedCar() {
        int x = RandomNumber.between(0, 1200);
        int y = RandomNumber.between(0, 700);

        Car redCar = new Car(x, y, Color.RED);
        addObject(redCar);
    }

    public void setBlueCar() {
        int x = RandomNumber.between(0, 1200);
        int y = RandomNumber.between(0, 700);

        Car blueCar = new Car(x, y, Color.BLUE);
        addObject(blueCar);
    }

    public void setYellowCar() {
        int x = RandomNumber.between(0, 1200);
        int y = RandomNumber.between(0, 700);

        Car yellowCar = new Car(x, y, Color.YELLOW);
        addObject(yellowCar);
    }

    public void removeRedCars() {
        for (int i = 0; i < sceneObjects.size(); i++) {
            Car car = (Car) sceneObjects.get(i);
            if (car.getColor() == Color.RED) {
                sceneObjects.remove(i);
                i--;
            }
        }
    }

    public void removeBlueCars() {
        for (int i = 0; i < sceneObjects.size(); i++) {
            Car car = (Car) sceneObjects.get(i);
            if (car.getColor() == Color.BLUE) {
                sceneObjects.remove(i);
                i--;
            }
        }
    }

    public void removeYellowCars() {
        for (int i = 0; i < sceneObjects.size(); i++) {
            Car car = (Car) sceneObjects.get(i);
            if (car.getColor() == Color.YELLOW) {
                sceneObjects.remove(i);
                i--;
            }
        }
    }
    public void removeAllObjects() {
        sceneObjects.clear();
    }
}
