package threaduse;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        TT tt = new TT();
        tt.setName("老韩");
        tt.setPriority(Thread.MIN_PRIORITY);
        tt.start();//启动了子线程

        //主线程输出5个hi，然后中断子线程
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }
        System.out.println(tt.getName() + "的优先级" + tt.getPriority());
        tt.interrupt();
    }
}

class TT extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当线程执行到interrupt方法时，就会catch一个异常，可以加入自己的业务代码
                System.out.println(Thread.currentThread().getName() + "被中断了");
            }
        }
    }
}


