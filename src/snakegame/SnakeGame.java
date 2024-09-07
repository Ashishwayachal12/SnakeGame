package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame() {
        super("SnakeGame");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
