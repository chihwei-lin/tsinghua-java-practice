class FactorialThread extends Thread {
    private int num;

    public FactorialThread(int num) {
        this.num = num;
    }

    public void run() {
        int i = num;
        int result = 1;
        System.out.println("new thread started");
        while (i > 0) {
            result = result * i;
            i = i - 1;
        }
        System.out.println("The factorial of " + num + " is " + result);
        System.out.println("new thread ends");
    }
}

class FactorialThread2 implements Runnable{
    private int num;

    public FactorialThread2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int i = num;
        int result = 1;
        System.out.println("new thread started");
        while (i > 0) {
            result = result * i;
            i = i - 1;
        }
        System.out.println("The factorial of " + num + " is " + result);
        System.out.println("new thread ends");
    }
}

public class FactorialThreadTester {
    public static void main(String[] args) {
//        System.out.println("main thread starts");
//        FactorialThread thread = new FactorialThread(10);
//        thread.start();
//        try{
//            Thread.sleep(1);            // 让主线程休眠一毫秒
//        }catch (Exception e){};
//        System.out.println("main thread ends");

        // we can see the result was not sequential
        // main 方法调用 thread.start() 方法启动新线程后并不等待其 run 方法返回
        // 线程的 run 方法在一起独自运行，不影响原来的 main 方法的运行

        // 加了休眠后，主线程开始后，新线程也开始

        System.out.println("main thread starts");

        FactorialThread2 t = new FactorialThread2(10);
        new Thread(t).start();
        System.out.println("new thread started, main thread ends");
    }
}
