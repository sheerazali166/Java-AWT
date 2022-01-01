import java.awt.*;

public class ButtonTwoExample {

    Frame frame;
    Button button1, button2, button3;


    public ButtonTwoExample() {

        frame = new Frame("Kinza Buttons Frame");

        button1 = new Button();

        button2 = new Button("Kinza Button");

        button2.setBackground(Color.BLUE);

        button2.setForeground(Color.WHITE);

        button3 = new Button();

        button3.setLabel("Rabia Button");

        frame.add(button1);

        frame.add(button2);

        frame.add(button3);

        frame.setLayout(new FlowLayout());

        frame.setSize(300, 300);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new ButtonTwoExample();

    }
}
