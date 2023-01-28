import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.util.*;

class DateTime extends JFrame implements Runnable {

    Thread th;
    Date d = new Date();
    JLabel timeLabel = new JLabel();

    public DateTime() {
        this.setTitle("Date Time Apllication");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d.toString());
        this.add(timeLabel, BorderLayout.CENTER);
        th = new Thread(this);
        th.start();
    }

    public static void main(String args[]) {
        DateTime app = new DateTime();
        app.setBounds(50, 50, 600, 600);
        app.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            d = new Date();
            timeLabel.setText(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}