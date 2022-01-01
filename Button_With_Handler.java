import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_With_Handler {

    public static void main(String[] args) {

        TextField textField;

        Frame frame = new Frame("Kinza Frame");

        textField = new TextField();

        textField.setBounds(50, 50 , 150, 20);

        Button button = new Button("Kinza Click");

        button.setBounds(50, 100, 90, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText("Welcome to kinza world");
            }
        });

        frame.add(textField);

        frame.add(button);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }
}
