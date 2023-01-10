package tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * 坦克大战的绘图区<br>
 * 需要将panel做成一个线程，这个线程的唯一工作就是无休止地重绘
 * 保证一旦图形位置发生改变，就能立竿见影
 */
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //定义我的坦克
    Hero hero = null;
    Vector<Enemy> enemy = null;
    public MyPanel() {
        hero = new Hero(100, 100);//初始化自己的坦克
        hero.setSpeed(20);
        enemy = new Vector<>(3);
        int k = 100;
        for (int j = 0; j < 3; j++) {
            Enemy e = new Enemy(100 + k, 100);
            e.setDirect(2);
            //将一颗子弹加入enemy的子弹Vector中
            //初始化敌人的子弹Vector
            Bullet bullet = new Bullet(e.getX() + 20, e.getY() + 60, e.getDirect());
            e.bullets.add(bullet);
            //然后再启动敌人子弹的线程
            new Thread(bullet).start();
            //最后把敌人坦克加入敌人Vector
            this.enemy.add(e);
            k += 100;
        }

    }
    //把MyPanel做成一个线程，不停调用面板的重绘，这样就可以循环重绘
    @Override
    public void run() {
        //每一段时间，自行重绘，在全局启动这个线程，就会不定时重绘
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //既然repaint是反复调用的，则可在此判断是否击中敌人坦克
            if (hero.bullet != null && hero.bullet.isLive) {
                //遍历敌人所有的坦克，判断坦克和子弹是否碰到
                for (int i = 0; i < enemy.size(); i++) {
                    Enemy e = enemy.get(i);
                    hitTank(hero.bullet, e);
                }
            }
            this.repaint();
        }
    }

    /**
     * 判断我方子弹集中敌方坦克
     * @param bullet 我方子弹对象
     * @param enemy 敌人坦克对象
     */
    public static void hitTank(Bullet bullet, Enemy enemy) {
        if (!enemy.isLive)
            return;
        switch (enemy.getDirect()) {
            case 0:
            case 2:
                if (bullet.getX() > enemy.getX() &&
                        bullet.getX() < enemy.getX() + 40 &&
                        bullet.getY() > enemy.getY() &&
                        bullet.getY() < enemy.getY() + 60) {
                    enemy.isLive = false;
                    bullet.isLive = false;
                }
                break;
            case 1:
            case 3:
                if (bullet.getX() > enemy.getX() &&
                        bullet.getX() < enemy.getX() + 60 &&
                        bullet.getY() > enemy.getY() &&
                        bullet.getY() < enemy.getY() + 40) {
                    enemy.isLive = false;
                    bullet.isLive = false;
                }
                break;
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形默认黑色
        //画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        //画出hero射击的子弹
        if (hero.bullet != null)
            if (hero.bullet.isLive)
                drawBullet(hero.bullet, g);

        //画出敌人的坦克
        for (int i = 0; i < enemy.size(); i++) {
            //还要判断当前敌人坦克是否为真
            if (enemy.get(i).isLive)
                drawTank(enemy.get(i).getX(), enemy.get(i).getY(), g , enemy.get(i).getDirect(), 0);
            //循环绘制每一辆敌人坦克的每一颗子弹
            for (int j = 0; j < enemy.get(i).bullets.size(); j++) {
                if (enemy.get(i).bullets.get(j).isLive)
                    drawBullet(enemy.get(i).bullets.get(j), g);
                else//从Vector移除
                    enemy.get(i).bullets.remove(enemy.get(i).bullets.get(j));
            }
        }

    }
    //编写方法画出坦克

    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角y坐标
     * @param g 画笔
     * @param direction 坦克方向（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        //根据不同类型坦克设置不同颜色
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
            default:
                break;
        }
        //根据坦克的方向来绘制坦克
        switch (direction) {
            case 0:
                //填充有当前颜色高亮矩形
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克圆顶
                g.drawLine(x + 20, y, x + 20, y + 30);
                break;
            case 1:
                g.fill3DRect(x, y, 60, 10, false);//画出坦克左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克圆顶
                g.drawLine(x + 30, y+20, x + 60, y + 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出坦克圆顶
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3:
                g.fill3DRect(x, y, 60, 10, false);//画出坦克左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出坦克圆顶
                g.drawLine(x + 30, y+20, x , y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
                break;
        }
    }
    public void drawBullet(Bullet bullet, Graphics g) {
        g.fill3DRect(bullet.getX(), bullet.getY(), 5, 5, false);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_J) {
            //如果用户按下的是J，就发射
            System.out.println("子弹发射！");
            hero.shotEnemyTank();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
