package threaduse;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hello" + (i + 1));
                }
                System.out.println("子线程结束");
            }
        });
        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                thread.start();
                thread.join();
            }
            System.out.println("hi" + (i + 1));
        }
        System.out.println("主线程结束");
    }
}
