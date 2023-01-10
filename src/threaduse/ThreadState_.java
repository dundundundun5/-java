package threaduse;

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hi " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        System.out.println(thread.getName() + "状态: " +thread.getState());
        thread.start();
        while (Thread.State.TERMINATED != thread.getState()) {
            System.out.println(thread.getName() + "状态: " +thread.getState());
            Thread.sleep(1000);
        }
        System.out.println(thread.getName() + "状态: " +thread.getState());
    }
}
