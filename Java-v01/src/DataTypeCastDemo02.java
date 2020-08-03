public class DataTypeCastDemo02 {
    public static void main(String[] args) {
        double d = 3.5;
        float f = (float) d;         // narrowing casting   (double -> float)
        System.out.println(f);

        int i = (int) d;            // (double -> int)
        System.out.println(i);

        i = 100;
        byte b = (byte)i;          // (int -> byte)
        System.out.println(b);

        i = 128;
        b = (byte)i;            // byte can only represent 127 (overflow)
        System.out.println(b);

        
    }
}
