import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JPanel{

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;

    JButton button;
    JButton button2;
    JButton button3;
    

    public JPanel menuPanel;

    public Menu() {
        button = new Button();
        button2 = new Button2();
        button3 = new Button3();

        menuPanel = this;

        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(button3);
        
    }

    class Button extends JButton implements ActionListener {

        Button() {
            super("easy");
            addActionListener(this);
            setBounds(200, 200, 200, 45);
            addActionListener(this);
            setFont(new Font("Ink Free", Font.BOLD, 25));
            setFocusable(false);
            setBackground(Color.black);
            setForeground(Color.red);
            setBorder(BorderFactory.createLineBorder(Color.red));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new GameFrame(100);
        }

        
    }

    class Button2 extends JButton implements ActionListener {
        
        Button2() {
            super("medium");
            addActionListener(this);
            setBounds(200, 300, 200, 45);
            addActionListener(this);
            setFont(new Font("Ink Free", Font.BOLD, 25));
            setFocusable(false);
            setBackground(Color.black);
            setForeground(Color.red);
            setBorder(BorderFactory.createLineBorder(Color.red));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new GameFrame(75);
        }
    }

    class Button3 extends JButton implements ActionListener {

        Button3() {
            super("hard");
            addActionListener(this);
            setBounds(200, 400, 200, 45);
            addActionListener(this);
            setFont(new Font("Ink Free", Font.BOLD, 25));
            setFocusable(false);
            setBackground(Color.black);
            setForeground(Color.red);
            setBorder(BorderFactory.createLineBorder(Color.red));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new GameFrame(50);
            
        }
    }

}
