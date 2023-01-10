package threaduse;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T22 t2 = new T22();
        t2.start();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("main吃包子"+ (i + 1));
            if (i == 4) {
                System.out.println("主线程别吃了");

                //t2.join();//线程插队让t2先执行
                Thread.yield();//礼让
                System.out.println("主线程接着吃");
            }
        }

    }
}

class T22 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread吃包子"+ (i + 1));
        }
    }
}