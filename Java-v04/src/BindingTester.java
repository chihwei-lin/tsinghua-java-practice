class Shape{
    void draw() {}
    void erase() {}
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Square.draw()");
    }

    @Override
    void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle.erase()");
    }
}

public class BindingTester {
    public static void main(String[] args) {        // dynamic binding 动态绑定
        Shape[] s = new Shape[9];
        int n;
        for(int i=0;i<s.length;i++){
            n = (int)(Math.random()*3);
            switch (n){
                case 0: s[i] = new Circle(); break;
                case 1: s[i] = new Square(); break;
                case 2: s[i] = new Triangle();
            }
        }
        for(int i=0;i<s.length;i++){
            s[i].draw();
        }

        // 随机生成对象
        // 编译时无法知道数组元素指向的实际对象类型，运行时才能确定类型 = 动态绑定
    }
}
