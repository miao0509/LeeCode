package white.Learn.JUC.Lock;

import java.util.concurrent.locks.ReentrantLock;

class LTicked {
    private int num = 30;
    private final ReentrantLock lock = new ReentrantLock();

    public void sale() {

        lock.lock();
        try {
            if (this.num > 0) {
                System.out.println(Thread.currentThread().getName() + "        余票 " + this.num--);
            }
        } finally {
            lock.unlock();
        }

    }
}

public class SaleTicked {
    public static void main(String[] args) {
        LTicked ticked = new LTicked();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticked.sale();
            }
        }, "ONE").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticked.sale();
                }
            }
        }, "TWO").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticked.sale();
                }
            }
        }, "THREE").start();
    }
}
