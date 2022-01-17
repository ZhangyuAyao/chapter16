package com.hspedu.tank;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{//JFrame对应窗口，可以理解成一个画框
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }

    public DrawCircle() {//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口（）
        this.add(mp);
        //设置窗口的大小
        this.setSize(600, 600);
        //当点击窗口的小x。程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); //可以显示
    }
}

class MyPanel extends JPanel {

    //1.
    @Override
    public void paint(Graphics g) {
        super.paint(g);//调用父类的初始化方法
        System.out.println("paint 方法被调用了");
        //这些方法的详细信息可以通过查找JDK1.8中文文档
        //画出一个圆形
        //g.drawOval(10, 10, 100, 100);
        //画直线
        //g.drawLine(10, 10, 100, 100);
        //画矩形边框
        //g.drawRect(10, 10, 100, 100);
        //画椭圆边框 drawOval
        //填充矩形
        //先设置画笔的颜色
//        g.setColor(Color.BLUE);
//        g.fillRect(10, 10, 100, 100);

        //填充椭圆
//        g.setColor(Color.RED);
//        g.fillOval(10, 10, 50, 100);

        //画图片 drawImage
        //1. 获取图片资源，/maomi.png 表示在该项目的根目录去获取 maomi.png 图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/maomi.png"));
//        g.drawImage(image, 10, 10, 447, 402, this);

        //画字符串
        //给画笔设置颜色和字体
        g.setColor(Color.RED);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        //这里设置的100， 100 ，是“北京你好”左下角
        g.drawString("北京你好", 100, 100);

    }

}
