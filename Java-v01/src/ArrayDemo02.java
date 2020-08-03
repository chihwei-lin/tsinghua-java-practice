import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] a1 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(a1));

        int[] a2 = { 10, 20, 30 };
        System.out.println(Arrays.toString(a2));

        System.out.println(a1.length);
        System.out.println(a2.length);

//        int[] a3 = new int[2147483647];     // out of memory error
        int[] a3 = new int[0];
        System.out.println(Arrays.toString(a3));

//        int[] a4 = new int[-10];      // negative index error
    }
}
