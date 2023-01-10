package threaduse;

public class SellTicket{
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;//票数

    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0) {
                System.out.println("卖完了");
                break;
            }
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "窗口"+
                    Thread.currentThread().getName()+
                    "卖出一张票" +
                    " 剩余票数 " +
                    (--ticketNum));
        }
    }
}

//实现接口的方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100;//票数

    @Override
    public void run() {
        while(true) {
            if (ticketNum <= 0) {
                System.out.println("卖完了");
                break;
            }
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "窗口"+
                            Thread.currentThread().getName()+
                            "卖出一张票" +
                            " 剩余票数 " +
                            (--ticketNum));
        }
    }
}

//使用synchronized实现线程同步
//同步方法如果没有static，默认锁对象为this
//如果有static，默认锁对象为类.class对象
class SellTicket03 implements Runnable {
    private int ticketNum = 1000;//票数
    final Object object = new Object();
    //1. 同步方法public synchronized int sell()这时锁在this对象上
    //2. 也可以在代码块上写synchronized,互斥锁还是在this对象上的,
    //3. 如果把锁放在Object对象上，效果一样
    public synchronized int sell() {//同一时刻只能由一个线程执行run方法

        synchronized (/*this*/object) {
            if (ticketNum <= 0) {
                System.out.println("卖完了");
                return 0;
            }
            //休眠50ms
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                    "窗口" +
                            Thread.currentThread().getName() +
                            "卖出一张票" +
                            " 剩余票数 " +
                            (--ticketNum));
            return 1;
        }
    }
    //同步静态方法的锁为当前类本身，因为静态方法只加载一次
    public synchronized static void m1() {

    }
    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }
    @Override
    public void run() {
        while(sell() != 0);
    }
}