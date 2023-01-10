package tankgame;

import java.util.Vector;

/**
 * 1. 在敌人坦克类，使用Vector保存多个子弹<br>
 * 2. 每创建一个敌人坦克对象，给该敌人坦克对象初始化一个子弹对象，同时启动子弹<br>
 * 3. 需要绘制所有子弹，当子弹不再存活，就从Vector中删除
 */
public class Enemy extends Tank{
    Vector<Bullet> bullets = new Vector<>();
    boolean isLive = true;//坦克存活
    public Enemy(int x, int y) {
        super(x, y);
    }
}
