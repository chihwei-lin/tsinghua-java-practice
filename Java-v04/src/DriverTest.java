import java.lang.invoke.VarHandle;

abstract class Vehicle{
    private String type;
    public Vehicle() {}
    public Vehicle(String s) { type = s; }
    abstract void drivedByFemaleDriver();
    abstract void drivedByMaleDriver();
}

class Car extends Vehicle{
    public Car() {}
    public void drivedByFemaleDriver(){
        System.out.println("A Female driver drives a car.");
    }
    public void drivedByMaleDriver(){
        System.out.println("A Male driver drives a car.");
    }
}

class Bus extends Vehicle{
    public void drivedByFemaleDriver(){
        System.out.println("A Female driver drives a bus.");
    }
    public void drivedByMaleDriver(){
        System.out.println("A Male driver drives a bus.");
    }
}

abstract class Driver{
    public Driver() {}
    abstract void drives(Vehicle v);    // 在类里，必须加 abstract
}

class FemaleDriver extends Driver{
    public FemaleDriver() {}
    public void drives(Vehicle v){
        v.drivedByFemaleDriver();
    }
}

class MaleDriver extends Driver{
    public MaleDriver() {}
    public void drives(Vehicle v){
        v.drivedByMaleDriver();
    }
}

public class DriverTest {
    public static void main(String[] args) {
        // double dispatching implementation

        Driver a = new FemaleDriver();
        Driver b = new MaleDriver();
        Vehicle x = new Car();
        Vehicle y = new Bus();

        a.drives(x);
        a.drives(y);

        b.drives(x);
        b.drives(y);
    }
}
