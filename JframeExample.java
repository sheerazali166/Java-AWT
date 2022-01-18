import javax.swing.*;

public class JframeExample {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("Kinza Click");

        jButton.setBounds(140, 100, 100, 40);

        jFrame.add(jButton);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }
}
