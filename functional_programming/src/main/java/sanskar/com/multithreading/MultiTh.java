package sanskar.com.multithreading;

public class MultiTh {
    public static void main(String[] args) throws InterruptedException {
        Fuctn f = new Fuctn();
        Thread t1 = new Thread(()->{
            for(int i = 0  ; i < 100000 ; i++){
                f.count();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0  ; i < 100000 ; i++){
                f.count();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Fuctn.count);

    }


}
