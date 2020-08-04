class A1 {
    int x = 2;
//    static int x = 2;     // static variable is not inherited, but it can be accessed by all Child class objects

    public void setX(int i) {
        x = i;
    }

    void printa() {
        System.out.println(x);
    }
}

class B1 extends A1 {
    int x = 100;        // variable hiding

    void printb() {
        super.x = super.x + 10;        // get the x from parent class
        System.out.println("super.x=" + super.x + " x=" + x);
    }

//    void printa(){        // method overriding
//
//    }
}

public class EXAM4_4TEST {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.setX(4);         // x = 4
        a1.printa();        // 4

        B1 b1 = new B1();
        b1.printb();        // super.x=12, x=100
        b1.printa();        // 12

        b1.setX(6);         // super.x = 6
        b1.printb();        // super.x=16, x=100
        b1.printa();        // 16
        a1.printa();        // 4
    }
}
