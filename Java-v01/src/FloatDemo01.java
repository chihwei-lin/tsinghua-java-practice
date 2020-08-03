public class FloatDemo01 {
    public static void main(String[] args) {
        float f1 = 0.8f;        // add f at the end
        f1 = 1.36e+5f;
        f1 = 1.36e-5f;
        f1 = .5f;       // supported, but not recommend

        double d1 = 0.8;    // dot
        d1 = 0.8d;
        d1 = 1.3628e+102;
        d1 = 1.3628e-102;

        d1 = 0x12.2p2;      // hex to represent floating number
        // d1 = 0x1.36e;

        System.out.println(d1);

        d1 = 92_873_293.38_923; // underscore to separate
    }
}
