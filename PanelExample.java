import java.awt.*;

public class PanelExample {

    public PanelExample() {

        Frame frame = new Frame("Kinza Panel Frame");

        Panel panel = new Panel();

        panel.setBounds(40, 80, 200, 200);

        panel.setBackground(Color.gray);

        Button button1 = new Button("Button 1");

        button1.setBounds(50, 100, 80, 30);

        button1.setBackground(Color.yellow);

        Button button2 = new Button("Button 2");

        button2.setBounds(100, 100, 80, 30);

        button2.setBackground(Color.green);

        panel.add(button1);

        panel.add(button2);

        frame.add(panel);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }

    public static void main(String[] args) {

        new PanelExample();
    }
}
