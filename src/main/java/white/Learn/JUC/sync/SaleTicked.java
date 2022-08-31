package white.Learn.JUC.sync;
class Ticked{
    private int num = 30;
    public synchronized void  sale(){
        if (this.num>0) {
            System.out.println(Thread.currentThread().getName() + "        余票 "+ this.num--);

        }
    }
}
public class SaleTicked {
    public static void main(String[] args) {
        Ticked ticked = new Ticked();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticked.sale();
                }
            }
        },"ONE").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticked.sale();
                }
            }
        },"TWO").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticked.sale();
                }
            }
        },"THREE").start();
    }
}
