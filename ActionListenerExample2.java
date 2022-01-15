import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample2 {

    public static void main(String[] args) {

        Frame frame = new Frame("Kinza's Action Listener");

        TextField textField = new TextField();

        textField.setBounds(50, 50, 150, 20);

        Button button = new Button("Click Here");

        button.setBounds(50, 100, 80, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText("Welcome to kinza point");
            }
        });

        frame.add(textField);

        frame.add(button);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }
}
