import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample extends Frame implements ItemListener {

    Label label;

    Checkbox checkbox;

    Checkbox checkbox2;

    public ItemListenerExample() {

        Frame frame = new Frame("Kinzi Pinzi Ji Frame");

        label = new Label();

        label.setAlignment(Label.CENTER);

        label.setSize(400, 100);

        checkbox = new Checkbox("C++");

        checkbox.setBounds(100, 100, 50, 50);

        checkbox2 = new Checkbox("Java");

        checkbox2.setBounds(100, 150, 50, 50);

        checkbox.addItemListener(this);

        checkbox2.addItemListener(this);

        frame.add(label);

        frame.add(checkbox);

        frame.add(checkbox2);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getSource() == checkbox){

            label.setText("C++ Checkbox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
        }

        if(e.getSource() == checkbox2){

            label.setText("Java Checkbox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
        }
    }

    public static void main(String[] args) {

        new ItemListenerExample();
    }
}
