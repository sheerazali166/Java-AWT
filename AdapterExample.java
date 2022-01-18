import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterExample {

    public AdapterExample() {

        Frame frame = new Frame("Kinza Adapter Frame");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

                frame.dispose();
            }
        });

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new AdapterExample();
    }
}
