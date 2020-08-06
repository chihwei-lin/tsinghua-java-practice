abstract class Glyph{           // 抽象类
    abstract void draw();       // 抽象方法
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();             // 抽象方法 = 多态方法 ，因为是在真正构造哪个子类时才会调用呢个子类的 draw 方法
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{     //  继承了抽象类 Glyph，需实现抽象方法 draw()
    int radius = 1;
    RoundGlyph(int r){
        // 当没有声明 super 方法，程序自动调用 super() 【空参数】
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        // RoundGlyph 构造方法里调用 super() 即 超类的构造方法
        // 在 Glyph 构造方法里先调用了 draw 方法
        // 但 radius 并未初始化，因此第一次调用 draw 方法显示为零
        // 第二次调用 draw 方法，radius 在 RoundGlyph 构造方法里初始为 5
    }
}
