class TestThread implements Runnable {
    private int sleepTime;

    public TestThread() {
        sleepTime = (int) (Math.random() * 6000);
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " going to sleep for "+sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException ie) {
        };

        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

public class ShareTargetTester2 {
    public static void main(String[] args) {
        System.out.println("Starting threads");
        TestThread threadobj = new TestThread();

        new Thread(threadobj, "Thread1").start();       // 直接创建一个 Thread 对象，并调用 start 方法
        new Thread(threadobj, "Thread2").start();
        new Thread(threadobj, "Thread3").start();

        System.out.println("Threads started, main ends");

        // sleepTime 都一样
        // 因为是用一个 Runnable 类型对象创建的线程，因此三个线程就共享了这个对象的私有成员 sleepTime
    }
}
