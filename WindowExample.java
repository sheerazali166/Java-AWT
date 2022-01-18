import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowExample extends Frame implements WindowListener {

    public WindowExample(){

        addWindowListener(this);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);


    }


    public static void main(String[] args) {

        new WindowExample();
    }


    @Override
    public void windowOpened(WindowEvent e) {

        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.out.println("Window Closing");
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {

        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

        System.out.println("Window Deiconified");
    }


    @Override
    public void windowActivated(WindowEvent e) {

        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

        System.out.println("Window Deactivated");
    }
}
