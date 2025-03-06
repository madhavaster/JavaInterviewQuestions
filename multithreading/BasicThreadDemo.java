package multithreading;

public class BasicThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        Thread t2 = new MyThread();
        t2.start();
        Thread t3 = new MyThread();
        t3.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("inside run method" + Thread.currentThread().getName());
    }
}


