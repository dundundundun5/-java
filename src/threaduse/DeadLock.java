package threaduse;

public class DeadLock {
    public static void main(String[] args) {
        //模拟死锁
        DeadLockDemo A = new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);
        A.start();B.start();

    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //一个线程抢了o1，一个线程抢了o2，就会导致死锁，每个线程都在获取对方已经拥有的锁
        //从而进入Block状态 
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4  ");
                }
            }
        }
    }
}