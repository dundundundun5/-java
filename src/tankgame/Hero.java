package tankgame;

public class Hero extends Tank{
    /**
     * <head><h1>按下J以后坦克发射一颗子弹的分析</h1></head>
     * 1. 真正发射子弹的是坦克，因此子弹应该是坦克的属性<br>
     * 2. 子弹要不断地绘制直到画框边缘，因此子弹必须是线程类<br>
     * 3. 是坦克射出了子弹，因此子弹线程的启动应该由坦克完成<br>
     */
    Bullet bullet = null;
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank() {
        //创建shot
        //要根据当前hero对象的位置和方向确定子弹的方向
        switch (getDirect()){
            case 0:
                bullet = new Bullet(getX() + 20, getY(), 0);
                break;
            case 1:
                bullet = new Bullet(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                bullet = new Bullet(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                bullet = new Bullet(getX(), getY() + 20, 3);
                break;
            default:
                break;
        }
        //启动子弹线程
        new Thread(bullet).start();
    }
}
