import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count = new AtomicInteger();
    public void increment(){
        count.incrementAndGet();
    }

    // 使用 AtomicInteger 后，不需要加锁，也可以实现线程安全
    public int getCount(){
        return count.get();
    }
}