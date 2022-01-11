import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample {

    public PopupMenuExample() {

        Frame frame = new Frame("Pop Up Menu Frame");

        PopupMenu popupMenu = new PopupMenu("Edit");

        MenuItem menuItemCut = new MenuItem("Copy");

        menuItemCut.setActionCommand("Copy");

        MenuItem menuItemCopy = new MenuItem("Cut");

        menuItemCopy.setActionCommand("Cut");

        MenuItem menuItemPaste = new MenuItem("Paste");

        menuItemPaste.setActionCommand("Paste");

        popupMenu.add(menuItemCopy);

        popupMenu.add(menuItemCut);

        popupMenu.add(menuItemPaste);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                popupMenu.show(frame, e.getX(), e.getY());


            }
        });



        frame.add(popupMenu);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);


    }



    public static void main(String[] args) {

        new PopupMenuExample();
    }
}
