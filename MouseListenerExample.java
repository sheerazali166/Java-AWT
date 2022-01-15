import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends Frame implements MouseListener {

    Label label;

    public MouseListenerExample(){

        addMouseListener(this);

        label = new Label();

        label.setBounds(20, 50, 100, 20);

        add(label);

        setSize(300, 300);

        setLayout(null);

        setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        label.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {

        new MouseListenerExample();
    }
}
