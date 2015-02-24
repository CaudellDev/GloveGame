package GloveGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;

/**
 * Primary class. Creates Window, and positions elements in window
 * and handles some low level events.
 */
public class GloveGame extends JFrame {
    
    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            new GloveGame();
        });
    }
    
    public GloveGame() {
        this.setTitle("Awesome Glove");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(gloveModelPanel(this));
        this.pack();
        this.setVisible(true);
    }
    
    public static JPanel gloveModelPanel(JFrame frame) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Screen screen = new StartScreen();
        DisplayPanel view = new DisplayPanel(screen);
        panel.add(view, BorderLayout.CENTER);
//        ControlPanel controls = new ControlPanel(view, model);
//        panel.add(controls, BorderLayout.EAST);
//        if (frame != null) {
//            frame.getRootPane().setDefaultButton(
//                controls.getDefaultButton());
//        }
        return panel;
    }
}
