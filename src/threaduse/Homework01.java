package threaduse;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {
    private static class A extends Thread {
        boolean loop = true;
        Random rand = new Random();
        @Override
        public void run() {
            while(loop) {
                System.out.println(rand.nextInt(100));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        public void setLoop(boolean loop) {
            this.loop = loop;
        }
    }
    private static class B extends Thread{
        A tgt;
        Scanner sc = new Scanner(System.in);
        public B(A tgt) {
            this.tgt = tgt;
        }

        @Override
        public void run() {
            System.out.println("输入Q退出");
            if (sc.next().equals("Q")) {
                tgt.setLoop(false);
                System.out.println("已退出");
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}



