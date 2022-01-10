import java.awt.*;

public class MenuExample {

    public MenuExample() {

        Frame frame = new Frame("Hussain Ki Gand Ka Frame");

        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Menu");

        Menu subMenu = new Menu("Sub Menu");

        MenuItem menuItem = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");
        MenuItem menuItem3 = new MenuItem("Item 3");
        MenuItem menuItem4 = new MenuItem("Item 4");
        MenuItem menuItem5 = new MenuItem("Item 5");

        menu.add(menuItem);
        menu.add(menuItem2);
        menu.add(menuItem3);

        subMenu.add(menuItem4);
        subMenu.add(menuItem5);

        menu.add(subMenu);

        menuBar.add(menu);

        frame.setMenuBar(menuBar);

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new MenuExample();
    }
}
