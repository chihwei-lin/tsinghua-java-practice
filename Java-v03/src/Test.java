class GeneralType <Type> {      // generic type 泛型
    Type object;
    public GeneralType(Type object){
        this.object = object;
    }

    public Type getObject(){
        return object;
    }
}

class GeneralType2 <Type extends Number> {      // 限定了泛型范围 / 有限制的泛型 (只能是 Number 类或 Number 的子类)
    Type object;
    public GeneralType2(Type object){
        this.object = object;
    }
}

class GeneralMethod {       // generic method 泛型方法
    <Type> void printClassName(Type object){
        System.out.println(object.getClass().getName());
    }
}

class ShowType{
    public void show(GeneralType<?> o){     // 在泛型类中使用通配符 ?
        System.out.println(o.getObject().getClass().getName());
    }
}

public class Test{
    public static void main(String[] args) {
        GeneralType<Integer> i = new GeneralType<Integer>(2);
        GeneralType<Double> d = new GeneralType<Double>(0.33);
        GeneralType<String> s = new GeneralType<String>("hello");

        System.out.println("i.object = "+ (Integer)i.getObject());
//        System.out.println("d.object = "+(Integer)d.getObject());     // d.getObject() is a Double class (Double class -> Integer class) error

        GeneralMethod gm = new GeneralMethod();
        gm.printClassName("hello");
        gm.printClassName(3);
        gm.printClassName(3.0f);
        gm.printClassName(3.0);

        ShowType st = new ShowType();
        st.show(i);
        st.show(d);
        st.show(s);

        GeneralType2<Integer> i2 = new GeneralType2<Integer>(2);
//        GeneralType2<String> s2 = new GeneralType2<String>("hello");      // 不接受非 Number 类，ERROR

    }
}

