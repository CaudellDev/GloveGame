/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GloveGame;

import java.nio.ByteBuffer;
import static org.lwjgl.glfw.GLFW.*;
import org.lwjgl.glfw.GLFWvidmode;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 *
 * @author Tyler
 */
public class LWJGLMain implements Runnable {
    
    private int width = 700;
    private int height = 600;
    
    private boolean running = false;
    private Thread thread;
    private long window;
    
    public void start() {
        running = true;
        thread = new Thread(this, "Game");
        thread.start();
    }
    
    public void run() {
        init();
        while (running) {
            update();
            render();
            
            if (glfwWindowShouldClose(window) == GL_TRUE) {
                running = false;
            }
        }
    }
    
    private void init() {
        if (glfwInit() != GL_TRUE) {
            // TODO: handle it
            return;
        }
        
        glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
        window = glfwCreateWindow(width, height, "Glove", NULL, NULL);
        
        if (window == NULL) {
            // TODO: handle
            return;
        }
        
        ByteBuffer vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());
        glfwSetWindowPos(window, (GLFWvidmode.width(vidmode) - width) / 2, (GLFWvidmode.height(vidmode) - height) / 2);
        glfwMakeContextCurrent(window);
        glfwShowWindow(window);
    }
    
    private void update() {
        glfwPollEvents();
    }
    
    private void render() {
        glfwSwapBuffers(window);
    }
    
    public static void main(String[] args) {
        new LWJGLMain().start();
    }
}
