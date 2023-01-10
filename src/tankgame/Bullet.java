package tankgame;

/**
 *
 */
public class Bullet implements Runnable {
    int x;//子弹的x
    int y;//子弹的y
    int direction = 0;//子弹的方向
    int speed = 40;//子弹的飞行速度
    boolean isLive = true;//子弹是否存活

    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向
            switch (direction) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
                default:
                    break;
            }
            //测试用
            System.out.format("子弹=(%d,%d)\n", x, y);
            //当子弹超出画框，则结束这个线程
            //当子弹碰到敌人坦克时，也应该结束线程
            if (!isLive)
                break;
            if (x < 0 || x > 1000 || y < 0 || y > 750) {
                isLive = false;
                break;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
