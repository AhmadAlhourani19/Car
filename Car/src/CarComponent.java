public abstract class CarComponent {
    protected int x; // X-coordinate of the component
    protected int y; // Y-coordinate of the component

    public CarComponent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
}
