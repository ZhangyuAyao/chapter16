package com.hspedu.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author: bytedance
 * @date: 2022/1/18
 * @description: 演示小球通过键盘上下左右的移动 -> 讲解java的事件控制
 */
public class BallMove extends JFrame{ //JFrame窗口
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ball = new BallMove();
    }

    //构造器
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //窗口JFrame 对象可以监听键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//面板，可以画出小球
//KeyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {

    //为了让小球可以移动，把他的左上角的坐标(x, y)设置变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x, y, 20, 20); //默认黑色
    }

    //有字符输出，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char)e.getKeyCode() + "被按下..");

        //根据用户按下的不同键，来处理小球的移动（上下左右的键）
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {//keyEvent.VK_DOWN就是向下的剪头
            y++;
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        //让面板重绘
        this.repaint();//这里调用了本类的repaint方法进行重绘

    }

    //当某个键释放（松开），该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
