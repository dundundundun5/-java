package threaduse;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        //去过希望主线程去控制t的线程终止，就要修改T.loop，因此需要setLoop
        //这是一种通知方式
        Thread.sleep(10000);
        t.setLoop(false);
    }
}

class T extends Thread {
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
