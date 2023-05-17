import javax.swing.JPanel;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel {
    private Scene scene;

    public DrawingArea() {
        super();
        scene = new Scene();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawing.set(g);

        scene.draw();
    }
}
