import java.awt.*;

public class ToolkitExample {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        System.out.println("Screen Resolution: " + toolkit.getScreenResolution());

        Dimension dimension = toolkit.getScreenSize();

        System.out.println("Screen Width: " + dimension.width);

        System.out.println("Screen Height: " + dimension.height);

    }
}
