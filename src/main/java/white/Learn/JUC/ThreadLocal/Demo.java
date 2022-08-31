package white.Learn.JUC.ThreadLocal;

public class Demo {
    private ThreadLocal<String> t1 = new ThreadLocal<>();
    public void setT1(String str){
        t1.set(str);
    }
    private String getT1(){
        return t1.get();
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                demo.setT1( Thread.currentThread().getName()+"   的数据" );
                System.out.println("``````````````````````````````");
                System.out.println(Thread.currentThread().getName()+"   " + demo.getT1());
            },""+i).start();
        }
    }
}
