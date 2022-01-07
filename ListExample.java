import java.awt.*;

public class ListExample {

    public ListExample() {

        Frame frame = new Frame("Mother India ki Cat Kutiya Urf Anarkali Frame");

        List list = new List(5);

        list.setBounds(100, 100, 75, 75);

        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        frame.add(list);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }

    public static void main(String[] args) {

        new ListExample();
    }
}
