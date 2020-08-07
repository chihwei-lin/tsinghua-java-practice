import java.io.*;

public class BufferedOutputStreamTester {
    public static void main(String[] args) throws IOException {
        String fileName = "mixedTypes.dat";

        // 一层包一层 （写档 -> 用 Buffer 存储 输出流 -> 二进位）
        DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        dataOut.writeInt(0);
        System.out.println(dataOut.size() + "bytes have been written");
        dataOut.writeDouble(31.2);
        System.out.println(dataOut.size() + "bytes have been written");
        dataOut.writeBytes("Java");
        System.out.println(dataOut.size() + "bytes have been written");
        dataOut.close();
    }
}
