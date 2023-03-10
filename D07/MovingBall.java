import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.*;

public class MovingBall extends JFrame {
    JLabel ballLabel = new JLabel();
    Thread ballThread;
    int ballX = 0;
    int ballY = 100;
    int flagX = 1;
    int flagY = 1;

    public MovingBall() {
        this.setTitle("Moving Ball");
        this.setLayout(null);
        MovingBall movingBall = new MovingBall();
    }

    class MovingBall implements Runnable {
        MovingBall() {
            ballLabel.setIcon(new ImageIcon("images/ball.png"));
            ballLabel.setBounds(250, 0, 50, 50);
            MovingBall.this.add(ballLabel);
            ballThread = new Thread(this);
            ballThread.start();
        }

        public void updatePosition() {
            ballX = ballX + 15 * flagX;
            if (ballX > MovingBall.this.getWidth() - ballLabel.getWidth())
                flagX = -1;
            if (ballX < 0)
                flagX = 1;
            ballY = ballY + 10 * flagY;
            if (ballY > MovingBall.this.getHeight() - ballLabel.getHeight())
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

        MovingBall app = new MovingBall();
        app.setBounds(50, 50, 700, 700);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}