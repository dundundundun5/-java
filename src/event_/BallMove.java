package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 演示小球通过键盘控制上下左右的移动，讲解java的事件控制
 */
public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {
        new BallMove();
    }
    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //这样JFrame就可以监听面板的事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
// 面板，可以画出小球
//KeyListener是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //有个键按下时
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char)e.getKeyCode());
        //根据用户按下的键位的不同，处理小球的移动
        if (e.getKeyCode() == KeyEvent.VK_S) {
            //键盘S对应的code
            y+=10;
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            y-=10;
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            x-=10;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            x+=10;
        }
        //重绘
        this.repaint();
    }


    //有个键松开时
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
