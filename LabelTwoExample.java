import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class LabelTwoExample implements ActionListener {

    Button button;

    TextField textField;

    Label label;

    public LabelTwoExample() {

        Frame frame = new Frame("IP Address Find Frame");

        textField = new TextField();

        textField.setBounds(50, 50, 150, 20);

        button = new Button("Find IP");

        button.setBounds(50, 150, 60 , 30);

        button.addActionListener(this);

        label = new Label();

        label.setBounds(50, 100, 250, 20);

        frame.add(button);

        frame.add(textField);

        frame.add(label);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new LabelTwoExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String host = textField.getText();

        try {

            String ip = java.net.InetAddress.getByName(host).getHostAddress();
             label.setText("Ip of: " + host + " is: " + ip);

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
