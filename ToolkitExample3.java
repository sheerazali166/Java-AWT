import java.awt.*;

public class ToolkitExample3 {

    public ToolkitExample3() {

        Frame frame = new Frame();

        Image icon = Toolkit.getDefaultToolkit().getImage("check.png");

        frame.setIconImage(icon);

        frame.setLayout(null);

        frame.setSize(400, 400);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new ToolkitExample3();


    }
}
