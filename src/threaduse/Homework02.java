package threaduse;

public class Homework02 {
    private static class Money implements Runnable {
        int money = 10000;

        @Override
        public void run() {
            while (take());
        }
        public boolean take() {
            //this对象锁本身就是不公平锁，因此一个线程可能连续强到，因此释放锁以后让其休眠
            synchronized (this) {
                if (money == 0)
                    return false;

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "-money = " + money);

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Money m = new Money();
        Thread a = new Thread(m);
        Thread b = new Thread(m);
        a.start();
        b.start();
    }
}
