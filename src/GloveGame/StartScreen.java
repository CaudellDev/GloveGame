package GloveGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import javax.swing.*;

/**
 * Handles the events and graphics
 * on the StartScreen.
 */
public class StartScreen implements Screen {
    
    private AnimatedFrame theFrame;
    
    public StartScreen(AnimatedFrame theFrame) {
        this.theFrame = theFrame;
        
        JButton button = new JButton("Test Button");
        button.setEnabled(true);
        button.setPreferredSize(new Dimension(100, 50));
        button.setVisible(true);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);
        
        JPanel panel = new JPanel(true);
        panel.setLayout(new FlowLayout());
        panel.add(button);
        
        this.theFrame.add(panel);
        
    }

    @Override
    public void update() {
        AnimatedFrame.Event event = theFrame.getNextEvent();
        
        while (event != null) {
            switch (event) {
                case TODO:
            }
            event = theFrame.getNextEvent();
        }
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, theFrame.getWidth(), theFrame.getHeight());
        
        
        
        // Button
//        g.setColor(Color.blue);
//        int xCen = theFrame.getWidth() / 2;
//        int yCen = theFrame.getHeight() / 2;
//        int width = 100;
//        int height = 50;
//        g.fillRect(xCen - width/2, yCen - height/2, width, height);
//        
//        g.setColor(Color.red);
//        g.drawString("Button", xCen - 40, yCen - 20);
        
        
    }

    @Override
    public Screen getNextScreen() {
        return null;
    }
    
    
}
