import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample extends Frame implements MouseMotionListener {


    public MouseMotionListenerExample(){

        addMouseMotionListener(this);

        setSize(300, 300);

        setLayout(null);

        setVisible(true);


    }


    @Override
    public void mouseDragged(MouseEvent e) {

        Graphics graphics = getGraphics();

        graphics.setColor(Color.BLUE);

        graphics.fillOval(e.getX(), e.getY(), 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {

        new MouseMotionListenerExample();
    }
}
