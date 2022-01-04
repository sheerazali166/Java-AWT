import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample2 {

    public CheckBoxExample2(){

        Frame frame = new Frame("Kinza Checkbox Frame");

        Label label = new Label();

        label.setAlignment(Label.CENTER);

        label.setSize(400, 100);

        Checkbox checkbox = new Checkbox("C++");

        checkbox.setBounds(100, 100, 50, 50);

        Checkbox checkbox2 = new Checkbox("Java");

        checkbox2.setBounds(100, 150, 50, 50);

        frame.add(label);

        frame.add(checkbox);

        frame.add(checkbox2);

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                label.setText("C++ Checkbox: " +
                        (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                label.setText("Java Checkbox: " +
                        (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }

    public static void main(String[] args) {

        new CheckBoxExample2();
    }
}
