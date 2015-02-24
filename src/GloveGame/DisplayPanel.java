package GloveGame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;

/**
 * This holds a Screen object. This handles lower level
 * stuff like positioning and size. It also tracks
 * what state the game is in, and swaps states upon trigger
 * by changing what Screen object is loaded.
 */
public class DisplayPanel extends JPanel {
    
    private Screen currScreen;
    
    public DisplayPanel(Screen screen) {
        currScreen = screen;
    }
}
