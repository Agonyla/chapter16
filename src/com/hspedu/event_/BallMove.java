package com.hspedu.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Author Agony
 * @Create 2023/2/16 12:58
 * @Version 1.0
 */
public class BallMove extends JFrame {
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    MyPanel myPanel;

    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.addKeyListener(myPanel);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println(e.getKeyChar());

        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN -> y += 5;
            case KeyEvent.VK_UP -> y -= 5;
            case KeyEvent.VK_LEFT -> x -= 5;
            case KeyEvent.VK_RIGHT -> x += 5;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}