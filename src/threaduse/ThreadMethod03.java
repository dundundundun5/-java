package threaduse;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        Thread myDaemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("宋喆和马蓉");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        //如果希望当main结束后，子线程可以自动结束
        //只需将子线程设为守护线程即可
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();


        for (int i = 0; i < 10; i++) {//main
            System.out.println("宝强工作");
            Thread.sleep(1000);
        }
    }
}
