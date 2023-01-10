package threaduse;

/**
 * 通过实现接口
 */
public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        //dog.start()不能调用start
//        //创建了Thread对象，把dog对象实现Runnable接口
//        //这里底层使用了设计模式：代理模式
//        Thread thread = new Thread(dog);
//        thread.start();
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}
class ThreadProxy implements Runnable {//可以把Proxy类当作Thread类对待
    private Runnable target = null;//类型是Runnable

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null)
            target.run();//动态绑定，运行类型是Tiger
    }

    public void start() {
        start0();//这个方法才是实现了多线程
    }

    public void start0() {
        //创造单线程后
        //调用代理的run方法
        run();
    }

}
class Animal {}
class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫。。。");
    }
}
class Dog implements Runnable{//通过实现runnable接口
    int count = 0;
    @Override
    public void run() {//这个方法并没有实现多线程
        while (count < 10) {
            System.out.println("hi"+ (++count) +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
