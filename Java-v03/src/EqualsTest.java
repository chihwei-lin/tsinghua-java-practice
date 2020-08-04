class BankAccount {
    String name;
    int id;
    float value;

    public BankAccount(String name, int id, float value){
        this.name = name;
        this.id = id;
        this.value = value;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Bob", 123456, 100.00f);
        BankAccount b = new BankAccount("Bob", 123456, 100.00f);

        System.out.println("a == b: "+(a==b));
        System.out.println("a.equals(b): "+(a.equals(b)));
    }
}
