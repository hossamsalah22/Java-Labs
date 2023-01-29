import java.awt.Point;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MixThread extends JFrame {
    // date
    JLabel timeLabel;
    Thread dateThread;
    Date date;
    // marquee
    JLabel marqueeLabel;
    Thread marquThread;
    // ball
    JLabel ball;
    Thread ballThread;
    int ballX = 0;
    int ballY = 100;
    int flagX = 1;
    int flagY = 1;

    public MixThread(String title) {
        setTitle(title);
        this.setLayout(null);
        DateTime dateTime = new DateTime();
        Marquee marquee = new Marquee();
        Ball ballObject = new Ball();
    }

    class Ball {
        Ball() {
            ball = new JLabel();
            ImageIcon icon = new ImageIcon("images/ball.png");
            ball.setIcon(icon);
            ball.setBounds(200, 200, 50, 50);
            MixThread.this.add(ball);
            ballThread = new Thread(new BallThread());
            ballThread.start();

        }
    }

    class BallThread implements Runnable {

        public void updatePosition() {
            ballX = ballX + 15 * flagX;
            if (ballX > this.getWidth() - imageLabel.getWidth())
                flagX = -1;
            if (ballX < 0)
                flagX = 1;
            ballY = ballY + 10 * flagY;
            if (ballY > this.getHeight() - imageLabel.getHeight())
                flagY = -1;
            if (ballY < 0)
                flagY = 1;
        }

        @Override
        public void run() {
            while (true) {
                ball.setBounds(ballX, ballY, 50, 50);
                imageLabel.setBounds(ballX, ballY, 50, 50);
                updatePosition();

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    class Marquee {
        Marquee() {
            marqueeLabel = new JLabel("ITI Java");
            marqueeLabel.setBounds(0, 100, 50, 20);
            MixThread.this.add(marqueeLabel);
            marquThread = new Thread(new MarqueeThread());
            marquThread.start();

        }
    }

    class MarqueeThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                double currentX = marqueeLabel.getLocation().getX();
                if (currentX > (MixThread.this.getWidth() + marqueeLabel.getWidth()))
                    currentX = 0;
                currentX += 5;
                marqueeLabel.setBounds((int) currentX, 100, 100, 20);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    class DateTime {
        DateTime() {
            date = new Date();
            timeLabel = new JLabel();
            timeLabel.setText(date.toString());
            timeLabel.setBounds(50, 50, 300, 20);
            MixThread.this.add(timeLabel);
            dateThread = new Thread(new DateThread());
            dateThread.start();
        }
    }

    class DateThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                date = new Date();
                timeLabel.setText(date.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MixThread mix = new MixThread("Mixed Thread");
        mix.setBounds(50, 50, 600, 400);
        mix.setVisible(true);
    }
}
