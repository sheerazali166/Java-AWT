import java.awt.*;

public class ScrollbarExample {


    public ScrollbarExample() {

        Frame frame = new Frame("Scrollbar Example");

        Scrollbar scrollbar = new Scrollbar();

        scrollbar.setBounds(100, 100,50, 100);

        frame.add(scrollbar);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }

    public static void main(String[] args) {
         new ScrollbarExample();
    }
}
