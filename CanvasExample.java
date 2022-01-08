import java.awt.*;

public class CanvasExample {

    public CanvasExample() {

        Frame frame = new Frame("Marathi Qom Ke Ego Ki Gaand");

        // Marathiyon ki Maan Samait Poori Qom Ko Chodha
        // Bagair Mardani Part Use Kiye Yaha Gaand Marathiyon
        // ko Lagta Hai Woh Apni Qom Ki Gaand Marwake Sindh
        // ko Neecha Dikhake Mera Sar Jhuka Sakte Hai Marathiyon
        // Gaand Mari Ja Chuki Hai Ab Reaction Ka Koi Faida Nahi
        // Aur Jake Apni Dukhon  ki Satayi Janani Gaand Marwane
        // Wali Marathi Maan Ko
        // Kaho Tum Ne Pakistan Se Q Chudayi Karwayi Happy Keema
        // I always Welcome Marathiyon Ki Aur Unki Najayaz Auladon
        // Ki Marne K Liye Aur Bahadur Diler Najayaz Na-Mard Nalaiq
        // Marathiyon ko Kute Ki Maut Marwane K Liye Haaaaaaaaaaaa
        // kitne gaandohon ko choona lagao ge me us tumhari
        // tunisha sharma par mootna aur thokna passand bhi nahi karta

        // Anarkali K Ego Ki Aur Jazbat Ki Gaand Zindabad Haaaaaaa


        frame.add(new MyCanvas());

        frame.setSize(400, 400);

        frame.setLayout(null);

        frame.setVisible(true);

    }


}

class MyCanvas extends Canvas{

    public MyCanvas() {

        setBackground(Color.GRAY);

        setSize(300, 200);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);

        g.fillOval(75,75,175, 75);
    }

    public static void main(String[] args) {
        new CanvasExample();
    }
}
