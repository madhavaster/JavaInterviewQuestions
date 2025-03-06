package multithreading;

class MyRunnable implements Runnable {

    private int count;

    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(myRunnable.getCount());
    }
}
