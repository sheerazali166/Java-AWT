package Kinza_001;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_Handling_Two extends Frame {

    TextField textField;

    public  Event_Handling_Two(){

        Button button = new Button("Click");

        textField = new TextField();

        button.setBounds(100,120,80,30);

        textField.setBounds(60,50,170,20);

        add(button);

        add(textField);

        OuterClass outerClass = new OuterClass(this);

        button.addActionListener(outerClass);

        setSize(300, 300);

        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Event_Handling_Two();
    }


}

class OuterClass implements ActionListener {

    Event_Handling_Two eventHandlingTwo;

    public OuterClass(Event_Handling_Two eventHandlingTwo){

        this.eventHandlingTwo = eventHandlingTwo;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        eventHandlingTwo.textField.setText("Hello Java");
    }
}



