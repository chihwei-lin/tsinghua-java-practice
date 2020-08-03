public class IntegerDemo01 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        byte b1 = 100;
        byte b2 = -100;
//        byte b3 = 128;    // byte range = [-128, 127] (8 bit)
//        byte b4 = -129;

        short s1 = 10000;
        short s2 = -30000;
//        short s3 = 40000;   // short range = [-32,768, 32,767] (16 bit)
//        short s4 = -40000;

        int i1 = 100000;
        int i2 = -10000000;
//        int i3 = 2147483648;    // int range = [-2147483648, 2147483647] (32 bit)
//        int i4 = -2147483649;

        long l1 = 2147483647;       // long range = [-9,223,372,036,854,775,808, 9,223,372,036,854,775,807] (64 bit)
//        long l2 = 2147483648;     // add L at the end of the primitive type int
        long l3 = 2147483648L;
    }
}
