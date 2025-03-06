package SingletonDesignPattern;

import java.time.Duration;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(DateUtil::getInstance);
        Thread t2 = new Thread(DateUtil::getInstance);
        t1.start();
        t2.start();
        Thread.sleep(Duration.ofSeconds(15));
        System.out.println(Thread.currentThread().getName());
    }
}
