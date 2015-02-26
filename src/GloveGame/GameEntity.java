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
public class GameEntity extends Entity {
    
    private BufferedImage img;

    @Override
    public int getX() {
        return xPos;
    }

    @Override
    public int getY() {
        return yPos;
    }
}
