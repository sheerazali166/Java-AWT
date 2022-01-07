import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListExample2 {

    public ListExample2() {

        Frame frame = new Frame("List Example Frame");

        Label label = new Label();

        label.setAlignment(Label.CENTER);

        label.setSize(500, 100);

        Button button = new Button("Button");

        button.setBounds(200, 150, 80, 30);

        List list = new List(4, false);

        list.setBounds(100, 100, 70, 70);

        list.add("Java");

        list.add("Java Swing");

        list.add("Java AWT");

        list.add("Software Developer");


        List list2 = new List(4, false);

        list2.setBounds(100, 200, 100, 70);

        list2.add("Java FX");

        list2.add("Intelij Idea");

        list2.add("MY SQL Server");

        list2.add("Notpad ++");

        frame.add(label);

        frame.add(list);

        frame.add(list2);

        frame.add(button);

        frame.setSize(600, 400);

        frame.setLayout(null);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data = "Programming Language Selected: " + list.getItem(list.getSelectedIndex());

                data += ", Framework Selected:";

                for (String frame: list2.getSelectedItems()){

                    data += frame + " ";
                }

                label.setText(data);
            }
        });



    }

    public static void main(String[] args) {

        new ListExample2();
    }
}
