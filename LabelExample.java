import java.awt.*;

public class LabelExample {

    public static void main(String[] args) {

        Frame frame = new Frame("Label Example");

        Label label1 = new Label("Label One");

        Label label2 = new Label("Label two");

        label1.setBounds(50, 100, 100, 30);

        label2.setBounds(50, 150, 100, 30);

        frame.add(label1);

        frame.add(label2);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }
}
