import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.*;

public class MultiThreading extends JFrame {
    // Date Thread
    JLabel timeLabel = new JLabel();
    Thread dateThread = new Thread();
    Date date;

    // Moving Text Thread
    JLabel movingTextLabel = new JLabel("Welcome To ITI");
    Thread movingTextThread= new Thread(); 

    // Moving Ball Thread
    JLabel ballLabel = new JLabel();
    Thread ballThread = new Thread();
    int ballX = 0;
    int ballY = 100;
    int flagX = 1;
    int flagY = 1;

    public MultiThreading() {
        this.setTitle("Multi Threading Lab");
        this.setLayout(null);

        DateTime dateTime = new DateTime();

        MovingText movingText = new MovingText();

        MovingBall movingBall = new MovingBall();

    }
   
    class DateTime implements Runnable {
        DateTime() {
            timeLabel.setBounds(200, 50, 200, 30);
            MultiThreading.this.add(timeLabel);
			dateThread = new Thread(this);
            dateThread.start();
        }

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

    class MovingText implements Runnable {
        MovingText() {
            movingTextLabel.setBounds(0, 150, 150, 30);
            MultiThreading.this.add(movingTextLabel);
            movingTextThread = new Thread(this);
            movingTextThread.start();
        }

        @Override
        public void run() {
            int x = 0;
            int newX = 1;
            while (true) {
                movingTextLabel.setBounds(x, 150, 150, 30);
                x += newX;
            if (x >= MultiThreading.this.getWidth()) {
                x = -1;
            }
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // For MovingBall Thread
    class MovingBall implements Runnable {
        MovingBall() {
            ballLabel.setIcon(new ImageIcon("images/ball.png"));
            ballLabel.setBounds(ballX, ballY, 50, 50);
            MultiThreading.this.add(ballLabel);
            			ballThread = new Thread(this);

            ballThread.start();
        }

        public void updatePosition() {
            ballX = ballX + 15 * flagX;
            if (ballX > MultiThreading.this.getWidth() - ballLabel.getWidth())
                flagX = -1;
            if (ballX < 0)
                flagX = 1;
            ballY = ballY + 10 * flagY;
            if (ballY > MultiThreading.this.getHeight() - ballLabel.getHeight())
                flagY = -1;
            if (ballY < 0)
                flagY = 1;
        }

        @Override
        public void run() {
            while (true) {
                ballLabel.setBounds(ballX, ballY, 50, 50);
                updatePosition();

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Main
    public static void main(String[] args) {

        MultiThreading app = new MultiThreading();
        app.setBounds(50, 50, 700, 700);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}