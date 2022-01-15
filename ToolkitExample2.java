import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolkitExample2 {

    public ToolkitExample2() {

        Frame frame = new Frame("Toolkit Example");

        Button button = new Button("Beep");

        button.setBounds(50, 100, 60, 30);

        frame.add(button);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Toolkit.getDefaultToolkit().beep();
            }
        });
    }

    public static void main(String[] args) {

        new ToolkitExample2();
    }
}
