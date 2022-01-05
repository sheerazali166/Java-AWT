import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxGroupExample2 {


    public CheckBoxGroupExample2(){

        Frame frame = new Frame("My Pragnant Wife Ramsha Frame");

        Label label = new Label();

        label.setAlignment(Label.CENTER);

        label.setSize(400, 100);

        CheckboxGroup checkboxGroup = new CheckboxGroup();

        Checkbox checkbox = new Checkbox("C++", checkboxGroup, true);

        checkbox.setBounds(100, 100, 50, 50);

        Checkbox checkbox2 = new Checkbox("Java", checkboxGroup, false);

        checkbox2.setBounds(100, 150, 50, 50);

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                label.setText("C++ Checkbox Checked");
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                label.setText("Java Checkbox Checked");

            }
        });

        frame.add(checkbox);

        frame.add(checkbox2);

        frame.add(label);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CheckBoxGroupExample2();
    }
}
