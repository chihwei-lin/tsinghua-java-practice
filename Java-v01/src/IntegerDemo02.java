public class IntegerDemo02 {
    public static void main(String[] args) {
        int i1 = 100;
        int i2 = 010;       // octal
        int i3 = 012;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = 0x10;          // hex
        int i5 = -0Xff;

        System.out.println(i4);
        System.out.println(i5);

//        starting from java 7, it supports binary representation

        int i6 = 0b1010;
        int i7 = 0b1111;

        System.out.println(i6);
        System.out.println(i7);

//        starting from java 7, it supports underscore
        int i8 = 123_456_789;
        int i9 = 0b1000_1111_1010_0000;

        System.out.println(i8);
        System.out.println(i9);
    }
}
