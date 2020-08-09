class Tickets2{
    int size;                       // 票总数
    int number = 0;                 // 存票序号
    int i=0;                        // 售票序号
    boolean available = false;      // 是否有待售的票

    public Tickets2(int size){
        this.size = size;
    }

    public synchronized void put(){
        System.out.println("Producer puts ticket "+(++number));
        available = true;
    }

    public synchronized void sell(){
        if(available == true && i <= number){
            System.out.println("Consumer buys ticket "+(++i));
            if(i == number)
                available = false;
        }
    }
}

class Tickets{
    int number = 0;
    int size;
    boolean available = false;
    public Tickets(int size){
        this.size = size;
    }
}

class Consumer extends Thread{
    Tickets2 t = null;
    int i = 0;

    public Consumer(Tickets2 t){
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread starts");
        while(i<t.size){
            t.sell();
        }
        System.out.println("Consumer thread ends");
    }
}

class Producer extends Thread{
    Tickets2 t = null;

    public Producer(Tickets2 t){
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Producer thread starts");
        while(t.number < t.size){
            t.put();
        }
        System.out.println("Producer thread ends");
    }
}

public class ProducerAndCustomer {
    public static void main(String[] args) {
        Tickets2 t = new Tickets2(10);

        new Consumer(t).start();
        new Producer(t).start();
    }
}
