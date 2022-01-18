package com.hspedu.tankgame2mywork;

import javax.swing.*;

public class HspTankGame01 extends JFrame {//JFrame就是面板

    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {

        HspTankGame01 hspTankGame01 = new HspTankGame01();

    }

    public HspTankGame01() {
        mp = new MyPanel();
        this.add(mp);//把面板加入到绘图区，里面会自动调用paint方法
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
