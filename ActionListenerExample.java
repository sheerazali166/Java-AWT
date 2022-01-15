import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExample implements ActionListener {

    public TextField textField;

    public ActionListenerExample() {

        Frame frame = new Frame("Action Listener Example");

        textField = new TextField();

        textField.setBounds(50, 50, 150, 20);

        Button button = new Button("Click Here");

        button.setBounds(50, 100, 80, 30);

        frame.add(textField);

        button.addActionListener(this);

        frame.add(button);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }


    public static void main(String[] args) {

        new ActionListenerExample();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        textField.setText("Welcome to Kinza Point");
    }
}
