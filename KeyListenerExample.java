import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample extends Frame implements KeyListener {

    Label label;

    TextArea textArea;

    public KeyListenerExample(){

        label = new Label();

        label.setBounds(20, 50, 100, 20);

        textArea = new TextArea();

        textArea.setBounds(20, 80, 300, 300);

        add(label);

        add(textArea);

        textArea.addKeyListener(this);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

        label.setText("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {

        label.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {

        label.setText("Key Released");
    }

    public static void main(String[] args) {

        new KeyListenerExample();
    }
}
