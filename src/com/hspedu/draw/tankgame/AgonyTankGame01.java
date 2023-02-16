package com.hspedu.draw.tankgame;

import javax.swing.*;

/**
 * @Author Agony
 * @Create 2023/2/15 20:44
 * @Version 1.0
 */
public class AgonyTankGame01 extends JFrame {

    public static void main(String[] args) {
        new AgonyTankGame01();
    }

    public AgonyTankGame01() {

        MyPanel myPanel = new MyPanel();
        this.add(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 750);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
