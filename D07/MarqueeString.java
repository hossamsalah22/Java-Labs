import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarqueeString extends JFrame implements Runnable {

    Thread th;

    JLabel textLabel = new JLabel("Welcome to ITI");
    int x = 0;
    int y = 100;
    int newX = 1;

    public MarqueeString() {
        this.setTitle("Marguee String");
        this.setLayout(null);
        textLabel.setBounds(x, y, 100, 100);
        this.add(textLabel);
        th = new Thread(this);
        th.start();
    }

    public static void main(String args[]) {
        MarqueeString app = new MarqueeString();
        app.setBounds(100, 100, 600, 600);
        app.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            textLabel.setBounds(x, y, 100, 100); // Change Position
            x += newX;
            if (x >= this.getWidth()) {
                x = -1;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}