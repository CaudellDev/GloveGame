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
    }

    @Override
    public Screen getNextScreen() {
        return null;
    }
    
    
}
