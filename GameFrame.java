import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    GameFrame(int DELAY) {

        this.add(new GamePanel(DELAY));
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
