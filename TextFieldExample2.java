import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample2 implements ActionListener {

    TextField textFieldNumber1, textFieldNumber2, textFieldResult;

    Button buttonPlus, buttonMinus;

    public TextFieldExample2() {

        Frame frame = new Frame("Kinza Calculator");

        textFieldNumber1 = new TextField();

        textFieldNumber1.setBounds(50, 50, 150, 20);

        textFieldNumber2 = new TextField();

        textFieldNumber2.setBounds(50, 100, 150, 20);

        textFieldResult = new TextField();

        textFieldResult.setBounds(50, 150, 150, 20);

        textFieldResult.setEditable(false);

        buttonPlus = new Button("+");

        buttonPlus.setBounds(50, 200, 50, 50);

        buttonMinus = new Button("-");

        buttonMinus.setBounds(120, 200, 50, 50);

        buttonPlus.addActionListener(this);

        buttonMinus.addActionListener(this);

        frame.add(textFieldNumber1);

        frame.add(textFieldNumber2);

        frame.add(textFieldResult);

        frame.add(buttonPlus);

        frame.add(buttonMinus);

        frame.setSize(300, 300);

        frame.setLayout(null);

        frame.setVisible(true);



    }


    public static void main(String[] args) {

        new TextFieldExample2();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String number1 = textFieldNumber1.getText();

        String number2 = textFieldNumber2.getText();

        int num1 = Integer.parseInt(number1);

        int num2 = Integer.parseInt(number2);

        int result = 0;

        if(e.getSource() == buttonPlus){

            result = num1 + num2;
        }

        else if(e.getSource() == buttonMinus){

            result = num1 - num2;
        }

        String res = String.valueOf(result);

        textFieldResult.setText(res);

    }
}
