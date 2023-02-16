package com.hspedu.draw.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Agony
 * @Create 2023/2/15 20:41
 * @Version 1.0
 * 坦克大战绘图区域
 */
public class MyPanel extends JPanel {

    MyTank myTank = null;

    public MyPanel() {
        myTank = new MyTank(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        drawTank(myTank.getX(), myTank.getY(), g, 0, 0);

    }

    /**
     * @param x         坦克左上角x坐标
     * @param y         坦克左上角y坐标
     * @param g         画笔
     * @param direction 坦克朝向(上下左右)
     * @param type      坦克种类
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            // 自己的坦克
            case 0 -> g.setColor(Color.cyan);
            // 敌人的坦克
            case 1 -> g.setColor(Color.yellow);
        }
        switch (direction) {
            // 向上朝向
            case 0 -> {
                g.fill3DRect(x, y, 10, 60, false); // 左边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 中间主体
                g.fill3DRect(x + 30, y, 10, 60, false); // 右边轮子
                g.fillOval(x + 10, y + 20, 20, 20); // 中间盖子
                g.drawLine(x + 20, y + 30, x + 20, y); // 杆
            }
            case 1 -> {
                System.out.println("还没画1");
            }
            case 2 -> {
                System.out.println("还没画2");
            }
            case 3 -> {
                System.out.println("还没画3");
            }
        }


    }
}
