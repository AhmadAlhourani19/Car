import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
    private DrawingArea drawing;
    private JPanel buttonPanel;

    private JButton addButtonRed;
    private JButton addButtonBlue;
    private JButton addButtonYellow;
    private JButton removeButtonRed;
    private JButton removeButtonBlue;
    private JButton removeButtonYellow;
    private JButton removeButtonAll;

    public DrawingTool(String title) {
        super(title);

        Dimension screenSize = getToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        this.setLayout(new BorderLayout());

        constructButtonPanel();
        constructDrawingArea();
        constructButtons();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void constructButtons() {
        addButtonRed = new JButton("Create Red Cars");
        addButtonRed.setToolTipText("Click to generate cars!");
        addButtonRed.addActionListener(this);
        buttonPanel.add(addButtonRed);

        addButtonBlue = new JButton("Create Blue Cars");
        addButtonBlue.setToolTipText("Click to generate cars!");
        addButtonBlue.addActionListener(this);
        buttonPanel.add(addButtonBlue);

        addButtonYellow = new JButton("Create Yellow Cars");
        addButtonYellow.setToolTipText("Click to generate cars!");
        addButtonYellow.addActionListener(this);
        buttonPanel.add(addButtonYellow);

        removeButtonRed = new JButton("Remove Red Cars");
        removeButtonRed.setToolTipText("Click to remove cars!");
        removeButtonRed.addActionListener(this);
        buttonPanel.add(removeButtonRed);

        removeButtonBlue = new JButton("Remove Blue Cars");
        removeButtonBlue.setToolTipText("Click to remove cars!");
        removeButtonBlue.addActionListener(this);
        buttonPanel.add(removeButtonBlue);

        removeButtonYellow = new JButton("Remove Yellow Cars");
        removeButtonYellow.setToolTipText("Click to remove cars!");
        removeButtonYellow.addActionListener(this);
        buttonPanel.add(removeButtonYellow);

        removeButtonAll = new JButton("Remove All");
        removeButtonAll.setToolTipText("Click to remove cars!");
        removeButtonAll.addActionListener(this);
        buttonPanel.add(removeButtonAll);
    }

    private void constructDrawingArea() {
        drawing = new DrawingArea();
        this.add(drawing, BorderLayout.CENTER);
    }

    private void constructButtonPanel() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(7, 1));
        this.add(buttonPanel, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new DrawingTool("Draw a car");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButtonRed) {
            System.out.println("Red car added!");
            drawing.getScene().setRedCar();
            drawing.repaint();
        } else if (e.getSource() == addButtonBlue) {
            System.out.println("Blue car added!");
            drawing.getScene().setBlueCar();
            drawing.repaint();
        } else if (e.getSource() == addButtonYellow) {
            System.out.println("Yellow car added!");
            drawing.getScene().setYellowCar();
            drawing.repaint();
        } else if (e.getSource() == removeButtonRed) {
            System.out.println("Red cars removed!");
            drawing.getScene().removeRedCars();
            drawing.repaint();
        } else if (e.getSource() == removeButtonBlue) {
            System.out.println("Blue cars removed!");
            drawing.getScene().removeBlueCars();
            drawing.repaint();
        } else if (e.getSource() == removeButtonYellow) {
            System.out.println("Yellow cars removed!");
            drawing.getScene().removeYellowCars();
            drawing.repaint();
        } else if (e.getSource() == removeButtonAll) {
            System.out.println("All objects removed!");
            drawing.getScene().removeAllObjects();
            drawing.repaint();
        }
    }
}
