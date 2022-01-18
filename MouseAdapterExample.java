import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends MouseAdapter {

    Frame frame;

    public MouseAdapterExample() {

        frame = new Frame("Kinza Mouse Adapter");

        frame.addMouseListener(this);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);



    }

    public static void main(String[] args) {

        new MouseAdapterExample();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        Graphics graphics = frame.getGraphics();

        graphics.setColor(Color.BLUE);

        graphics.fillOval(e.getX(), e.getY(), 30, 30);
    }
}
