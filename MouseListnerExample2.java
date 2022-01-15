import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListnerExample2 extends Frame implements MouseListener {

    public MouseListnerExample2(){

        addMouseListener(this);

        setSize(300, 300);

        setLayout(null);

        setVisible(true);

    }

    public static void main(String[] args) {

        new MouseListnerExample2();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        Graphics graphics = getGraphics();

        graphics.setColor(Color.BLUE);

        graphics.fillOval(e.getX(), e.getY(), 30, 30);

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
