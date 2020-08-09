class TestThread extends Thread {
    private int sleepTime;

    public TestThread(String name) {
        super(name);
        sleepTime = (int) (Math.random() * 6000);
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " going to sleep for " + sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException ie) {
        };
        System.out.println(getName() + " finished");
    }
}

public class ThreadSleepTester {
    public static void main(String[] args) {
        TestThread thread1 = new TestThread("thread 1");
        TestThread thread2 = new TestThread("thread 2");
        TestThread thread3 = new TestThread("thread 3");

        System.out.println("Starting threads");
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Threads started, main ends");
    }
}
