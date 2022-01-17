import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample2 extends Frame implements MouseMotionListener {


    Label label;

    Color color = Color.BLUE;

    public MouseMotionListenerExample2(){

        label = new Label();

        label.setBounds(20, 40, 100, 20);

        add(label);

        addMouseMotionListener(this);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);
    }



    @Override
    public void mouseDragged(MouseEvent e) {

        label.setText("X=" + e.getX() + ", Y=" + e.getY());

        Graphics graphics = getGraphics();

        graphics.setColor(Color.RED);

        graphics.fillOval(e.getX(), e.getY(), 20, 20);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        label.setText("X=" + e.getX() + ", Y=" + e.getY());
    }

    public static void main(String[] args) {

        new MouseMotionListenerExample2();
    }
}
