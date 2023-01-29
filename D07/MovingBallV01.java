import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.*;

public class MovingBallV01 extends JFrame {
    JLabel ballLabel = new JLabel();
    Thread ballThread;
    int ballX = 0;
    int ballY = 100;
    int flagX = 1;
    int flagY = 1;

    public MovingBallV01() {
        this.setTitle("Moving Ball");
        this.setLayout(null);

        MovingBall movingBall = new MovingBall();

    }

    class MovingBall implements Runnable {
        MovingBall() {
            ballLabel.setIcon(new ImageIcon("images/ball.png"));
            ballLabel.setBounds(ballX, ballY, 50, 50);
            MovingBallV01.this.add(ballLabel);
            ballThread = new Thread(this);
            ballThread.start();
        }

        public void updatePosition() {
            ballX = ballX + 15 * flagX;
            if (ballX > MovingBallV01.this.getWidth() - ballLabel.getWidth())
                flagX = -1;
            if (ballX < 0)
                flagX = 1;
            ballY = ballY + 10 * flagY;
            if (ballY > MovingBallV01.this.getHeight() - ballLabel.getHeight())
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

        MovingBallV01 app = new MovingBallV01();
        app.setBounds(50, 50, 700, 700);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}