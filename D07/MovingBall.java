import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MovingBall extends JFrame implements Runnable {

    Thread th;
    JLabel imageLabel = new JLabel();
    int ballX = 0;
    int ballY = 100;
    int flagX = 1;
    int flagY = 1;

    public MovingBall() {
        this.setTitle("Moving Ball");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("images/ball.png");
        imageLabel.setIcon(image);
        imageLabel.setBounds(50, 50, 50, 50);
        this.add(imageLabel);
        th = new Thread(this);
        th.start();
    }

    public static void main(String args[]) {
        MovingBall app = new MovingBall();
        app.setBounds(50, 50, 600, 600);
        app.setVisible(true);
    }

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
            imageLabel.setBounds(ballX, ballY, 50, 50);
            updatePosition();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}