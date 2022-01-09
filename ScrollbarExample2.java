import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarExample2 {

    public ScrollbarExample2() {

        Frame frame = new Frame("Scrollbar Frame");

        Label label = new Label();

        label.setAlignment(Label.CENTER);

        label.setSize(400, 100);

        Scrollbar scrollbar = new Scrollbar();

        scrollbar.setBounds(100, 100, 50,100);

        frame.add(label);

        frame.add(scrollbar);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {

                label.setText("Vertical Scrollbar Value is: " + e.getValue());
            }
        });
    }

    public static void main(String[] args) {

        new ScrollbarExample2();
    }
}
