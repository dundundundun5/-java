package tankgame;

import javax.swing.*;

public class HspTankGame01 extends JFrame {
    // MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();
    }

    public HspTankGame01() {
        mp = new MyPanel();
        //将mp放入thread并启动,
        new Thread(mp).start();
        this.add(mp);//把面板加入绘图区域
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
