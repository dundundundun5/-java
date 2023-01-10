package threaduse;

/**
 * main线程启动两个子线程
 *
 * 实现Runnable可让多线程共享资源，可让同一个T1放入两个Thread
 * 建议使用Runnable接口
 */
public class Thread03 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T2());
        thread1.start();
        thread2.start();


    }
}

class T1 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (count < 10) {
            System.out.println("hello" + (count++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class T2 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (count < 5) {
            System.out.println("hi" + (count++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}