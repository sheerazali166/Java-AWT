import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {

   public static Dialog dialog;

    public DialogExample() {

        Frame frame = new Frame();

        dialog = new Dialog(frame,"Dialog Example",false);

        dialog.setLayout(new FlowLayout());

        Button buttonOK = new Button("OK");

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DialogExample.dialog.setVisible(false);
            }
        });

        dialog.add(new Label("Click button to continue"));

        dialog.add(buttonOK);

        dialog.setSize(300, 300);

        dialog.setVisible(true);

    }

    public static void main(String[] args) {

        new DialogExample();
    }
}
