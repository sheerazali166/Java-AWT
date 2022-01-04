package Kinza_001;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_handling_Three extends Frame {

    TextField textField;

    public Event_handling_Three(){

        Button button = new Button("Click Me");

        textField = new TextField();

        button.setBounds(100, 120, 80, 30);

        textField.setBounds(60,50,170,20);

        add(button);

        add(textField);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                textField.setText("Hello Java AWT");
            }
        });

        setSize(300, 300);

        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {

        new Event_handling_Three();
    }
}
