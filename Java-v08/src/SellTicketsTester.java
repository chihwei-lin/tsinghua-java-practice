class SellTickets implements Runnable{
    private int tickets = 10;

    @Override
    public void run() {
        while(tickets > 0){
            System.out.println(Thread.currentThread().getName() + " is selling ticket " + tickets--);
        }
    }
}

public class SellTicketsTester {
    public static void main(String[] args) {
        SellTickets t = new SellTickets();

        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}
