import java.awt.*;

public class ChoiceExample {


    public ChoiceExample() {


        Frame frame = new Frame("Kinza Choice Frame");

        Choice choice = new Choice();

        choice.setBounds(100, 100, 75, 75);

        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");
        choice.add("Item 4");
        choice.add("Item 5");

        frame.add(choice);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new ChoiceExample();
    }
}
