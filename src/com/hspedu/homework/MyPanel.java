package com.hspedu.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 张宇
 * @version 1.0
 * 坦克大战的绘图区域
 */


public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    Hero hero2 = null;
    Hero hero3 = null;
    Hero hero4 = null;

    public MyPanel() {
        hero = new Hero(100, 0);
        hero.setSpeed(5);

        hero2 = new Hero(200, 0);
        hero2.setSpeed(5);

        hero3 = new Hero(300, 0);
        hero3.setSpeed(5);

        hero4 = new Hero(250, 300);
        hero4.setSpeed(5);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色

        //画出上面的三辆坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        drawTank(hero2.getX(), hero2.getY(), g, hero2.getDirect(), 0);
        drawTank(hero3.getX(), hero3.getY(), g, hero3.getDirect(), 0);

        //画出下面的坦克
        drawTank(hero4.getX(), hero4.getY(), g, hero4.getDirect(), 1);
    }

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克方向（上下左右）
     * @param type   坦克类型
     */
    //编写方法，画出坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {


        //根据不同类型的坦克，设置不同的颜色
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克的方向，来绘制对应形状的坦克
        // direct 表示方向（0：向上 1：向右 2：向下 3 向左
        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20,20);//画出圆形的盖子
                g.drawLine(x + 20, y + 30, x + 20, y); //画出坦克的炮管
                break;
            case 1: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上面的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下面的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20,20);//画出圆形的盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); //画出坦克的炮管
                break;
            case 2: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20,20);//画出圆形的盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); //画出坦克的炮管
                break;
            case 3: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上面的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下面的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20,20);//画出圆形的盖子
                g.drawLine(x + 30, y + 20, x, y + 20); //画出坦克的炮管
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            //改变坦克的方向
            hero.setDirect(0);
            //修改坦克的坐标 y -= 1
            hero.moveUp();
        } else if(e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if(e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if(e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }

        //让面板重新绘制
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
