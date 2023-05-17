import javax.swing.JFrame;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame {
    private DrawingArea drawing;

    public DrawingTool(String title) {
        super(title);

        Dimension screenSize = getToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        setResizable(true);

        drawing = new DrawingArea();
        add(drawing);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawingTool("Drum Kit");
    }
}
