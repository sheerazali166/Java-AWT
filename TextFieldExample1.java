import java.awt.*;

public class TextFieldExample1 {

    public static void main(String[] args) {

        Frame frame = new Frame("Kinza Chocolaty Frame");

        TextField textfield = new TextField("Hello Kinza");

        TextField textfield2 = new TextField();

        textfield2.setText("Hello Rabia");

        textfield.setBounds(50, 100, 200, 30);

        textfield2.setBounds(50, 150, 200, 30);

        frame.add(textfield);

        frame.add(textfield2);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}
