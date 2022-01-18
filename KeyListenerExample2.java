import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample2 extends Frame implements KeyListener {

    Label label;

    TextArea textArea;


    public KeyListenerExample2(){

        label = new Label();

        label.setBounds(20, 50, 200, 20);

        textArea = new TextArea();

        textArea.setBounds(20, 80, 300, 300);

        textArea.addKeyListener(this);

        add(label);

        add(textArea);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        String text = textArea.getText();

        String words[] = text.split("\\s");

        label.setText("Words: " + words.length + " Characters: " + text.length());
    }

    public static void main(String[] args) {

        new KeyListenerExample2();
    }
}
