public class DataTypeCastDemo01 {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = b;
        i = s;

        long l = b;
        l = s;
        l = i;

        char c = 'a';
        i = c;
        l = c;

        float f = 3.5f;
        double d = f;

        f = b;
        f = s;
        f = i;
        f = l;
        f = c;

        d = b;
        d = s;
        d = i;
        d = l;
        d = c;
    }
}
