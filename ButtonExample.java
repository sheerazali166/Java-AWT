import java.awt.*;

public class ButtonExample {


    public static void main(String[] args) {


        Frame frame = new Frame("Button Example");

        Button button = new Button("Click Me");

        button.setBounds(50, 100, 80, 30);

        frame.add(button);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    
    }
}
