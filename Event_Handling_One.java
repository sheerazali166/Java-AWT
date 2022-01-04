package Kinza_001;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Handling_One extends Frame implements ActionListener {

    TextField textField;

    public Event_Handling_One()  {

        Button button = new Button("Click me");

        textField = new TextField();

        textField.setBounds(60,50,170,20);

        button.setBounds(100,120,80,30);

        add(textField);

        add(button);

        button.addActionListener(this);

        setSize(300, 300);

        setLayout(null);

        setVisible(true);

    }

    public static void main(String[] args) {

        new Event_Handling_One();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        textField.setText("Computer Science");

    }
}
