package com.hspedu.tankgame2mywork;

public class Tank {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标
    private int direct = 0;
    private int speed = 1;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirect() {
        return direct;
    }

    public int getSpeed() {
        return speed;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y -= speed;//以speed的速度向上走
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
