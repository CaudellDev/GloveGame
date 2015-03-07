/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GloveGame;

import java.awt.image.BufferedImage;

/**
 *
 * @author Tyler
 */
public class MenuEntity {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    
    
    private BufferedImage icon;
    
    public MenuEntity() {
        
    }
    
    public MenuEntity(int x, int y) {
        
    }
    
    public MenuEntity(BufferedImage img) {
        
    }
    
    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }
    
}
