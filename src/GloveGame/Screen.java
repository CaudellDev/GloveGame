package GloveGame;

import java.awt.Graphics2D;

/**
 * Screen interface is where the game logic happens.
 * This interface separates screens by it's
 * purpose (ie pause screen, game screen, menu screen...).
 * This separation will be make events and graphics
 * much easier to handle with divide and conquer.
 */
public interface Screen {
    
    void update();
    void render(Graphics2D g);
    
    /**
     * This method checks to see if the current screen
     * triggered a different screen via event. It
     * returns the next screen if so, and null if
     * the event did not progress in a new screen.
     * @return 
     */
    public abstract Screen getNextScreen();

}
