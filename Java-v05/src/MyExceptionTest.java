class SuperclassOfMyException extends Exception{
    public SuperclassOfMyException(String str){
        super(str);     // 异常抛出信息
    }
}

class MyExceptionName extends SuperclassOfMyException{      // 异常类或其父类必须继承 Exception 类
    public MyExceptionName(){
        super("Some string explaining the exception");      // 异常抛出信息
    }
}

public class MyExceptionTest{
    public static void main(String[] args) {
        try{
            throw new MyExceptionName();
        }catch (MyExceptionName me){
            System.out.println(me);
        }
    }
}