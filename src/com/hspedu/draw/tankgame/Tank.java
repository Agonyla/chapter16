package com.hspedu.draw.tankgame;

/**
 * @Author Agony
 * @Create 2023/2/15 20:40
 * @Version 1.0
 */
public class Tank {

    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
