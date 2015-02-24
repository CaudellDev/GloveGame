package GloveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
