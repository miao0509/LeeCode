package white.Learn.JUC.sync;
class Share{
    private  int num = 0;
    public synchronized void increase() throws InterruptedException {
        while (this.num!=0){
            this.wait();
        }
        this.num++;
        System.out.println(Thread.currentThread().getName() + "    " + this.num);
        this.notifyAll();
    }
    public synchronized void decrease() throws InterruptedException {
        while (this.num!=1){
            this.wait();
        }
        this.num--;
        System.out.println(Thread.currentThread().getName() + "    " + this.num);
        this.notifyAll();
    }
}
public class demo {
    public static void main(String[] args) {
        Share share = new Share();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    share.increase();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        },"one").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    share.decrease();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        },"two").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    share.decrease();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        },"three").start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    share.increase();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        },"four").start();

    }

}
