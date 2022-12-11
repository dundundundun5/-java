package draw;

import javax.swing.*;
import java.awt.*;

/**
 * 演示如何在面板上画出圆形
 */
public class DrawCircle extends JFrame {//对应一个窗口
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(1400, 1300);
        //当点击窗口的小叉就退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//1先定义一个MyPanel()，继承JPanel类
//
class MyPanel extends JPanel {
    @Override
    // MyPanel对象就是一个画板
    // Graphics g 是一只画笔
    // Graphics提供了很多绘图的方法
    /**
     * 第一次在屏幕显示会调用paint<br>
     * 最小化再最大化，大小发生改变<br>
     * repaint函数被调用<br>
     */
    public void paint(Graphics g) {//绘图方法
        super.paint(g);
        //System.out.println("haha");
        //g.drawOval(0, 0, 100, 100);
        //画直线
        //g.drawLine(10, 10, 100, 100);
        //画矩形边框
        //g.drawRect(10,10,100,100);
        //填充矩形
        //g.setColor(Color.blue);
        //g.fillRect(10, 10, 100, 100);
        //填充椭圆
        //g.setColor(Color.red);
        //g.fillOval(10, 10, 100, 100);
        //画图片，先获取图片
        Image image = Toolkit.getDefaultToolkit().getImage(
                "D:\\MyJavaSE_Remastered\\out\\production\\MyJavaSE_Remastered\\draw\\1.png"
        );
        g.drawImage(image, 0, 0, 501, 506, this);
        //画字符串
        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("来骗", 100, 100);
    }
}
