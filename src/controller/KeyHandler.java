package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    Controller gamePanel;

    public KeyHandler(Controller gamePanel) {
        this.gamePanel = gamePanel;
    }

    public boolean up, down, left, right;

    @Override
    public void keyTyped(KeyEvent e) {
        // No implementation needed for keyTyped in this context
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                gamePanel.setDirection("up");
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                gamePanel.setDirection("left");
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                gamePanel.setDirection("down");
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                gamePanel.setDirection("right");
                break;
            case KeyEvent.VK_SPACE:
                gamePanel.pause = !gamePanel.pause;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        gamePanel.setDirection("stop");
    }      
}
