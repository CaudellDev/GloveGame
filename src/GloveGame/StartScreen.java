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
        
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 50);
        
    }

    @Override
    public Screen getNextScreen() {
        return null;
    }
    
    
}
