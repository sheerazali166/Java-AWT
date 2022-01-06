import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceExample2 {

    public ChoiceExample2() {

        Frame frame = new Frame("Artificial Intelligent Anarkali Urf Pathani Ka Ana Shaheed");

        Label label = new Label();

        label.setAlignment(Label.CENTER);

        label.setSize(400, 100);

        Choice choice = new Choice();

        choice.setBounds(100, 100, 220, 75);

        Button button = new Button("Select Madher-Chodon Ki Intelligence");

        button.setBounds(95, 150, 220 ,20);

        choice.add("Madher-Chod Anarkali");

        choice.add("Gaandoo Pathani");

        choice.add("Cat Kutiya");

        choice.add("Ke emotion ka huwa rape");

        choice.add("In sab ki gaand maar gaya");

        choice.add("ek bewaqoof gairati  chootya");

        choice.add("grairat k nam par");

        choice.add("Gairat Zindabad lannat");

        choice.add("hai intelligence Par");

        choice.add("Student of the year");

        choice.add("Madher-chodiyon Three Idioat par");

        choice.add("Jo ek chootye se chudhwa gayeen");



        frame.add(label);

        frame.add(button);

        frame.add(choice);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data = choice.getItem(choice.getSelectedIndex());

                label.setText(data);
            }
        });




    }

    public static void main(String[] args) {
        new ChoiceExample2();
    }
}
