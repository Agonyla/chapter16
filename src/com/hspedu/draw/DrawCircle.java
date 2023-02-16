package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Agony
 * @Create 2023/2/15 19:23
 * @Version 1.0
 */
public class DrawCircle extends JFrame {
    public static void main(String[] args) {
        new DrawCircle();

    }

    public DrawCircle() {

        MyPanel myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1200, 1200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawOval(10, 10, 200, 200);
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/pictures/Agony.jpg"));
        g.drawImage(image, 200, 200, 500, 500, this);
    }
}
