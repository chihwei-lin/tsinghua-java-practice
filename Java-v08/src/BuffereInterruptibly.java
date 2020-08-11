import java.util.concurrent.locks.ReentrantLock;

public class BuffereInterruptibly {
    private ReentrantLock lock = new ReentrantLock();

    public void write(){
        lock.lock();
        try{
            long startTime = System.currentTimeMillis();
            System.out.println("Start writing data into this buffer");
            for(;;){
                if(System.currentTimeMillis() - startTime > Integer.MAX_VALUE)
                    break;
            }
            System.out.println("Finally it's done");
        }finally{
            lock.unlock();
        }
    }

    public void read() throws InterruptedException {
        lock.lockInterruptibly();   // add a lock, but this lock can be interrupted / stopped
        try{
            System.out.println("Read data from this buffer");
        }finally {
            lock.unlock();
        }
    }
}
