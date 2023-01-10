package threaduse;

import java.io.IOException;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
        /**
         * public synchronized void start(){
         *      start0();是本地方法，是jvm调用，底层是C++C
         * }
         * 真正实现多线程的效果，是start0()
         */
        //当main线程启动一个子线程，主线程不会阻塞
        System.out.println(Thread.currentThread().getName());//main
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程");
            Thread.sleep(1000);
        }
    }
}

/**
 * 1.当一个类继承了Thread类，该类就可以当作线程使用
 * 2.我们会重写run方法
 * 3. Thread类的run方法来源于Runnable接口
 */
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("miaomiao" + times + Thread.currentThread().getName());
            //休眠一秒 ctrl+alt+t
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ++times;
            if (times == 80)
                break;
        }

    }
}
