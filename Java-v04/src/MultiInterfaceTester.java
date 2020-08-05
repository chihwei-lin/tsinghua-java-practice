// variable in an interface must be final
// method in an interface must be abstract
interface Shape2D {
    final double pi=3.14;   // final can be reduced
    public abstract double area();      // public abstract can be reduced, abstract method
}

interface Color{
    void setColor(String str);      // abstract method
}

class Circle implements Shape2D, Color {
    double radius;
    String color;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){       // 修饰符 public 一定得加
        return pi * radius * radius;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color: "+color);
    }
}

public class MultiInterfaceTester{
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        circle.setColor("blue");
        System.out.println("Area: "+circle.area());
    }
}


