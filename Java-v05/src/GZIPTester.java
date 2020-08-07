import java.io.*;
import java.util.zip.*;

public class GZIPTester {
    public static void main(String[] args) throws IOException{
        FileInputStream in = new FileInputStream("hello.txt");
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream("test.gz"));

        System.out.println("Writing compressing file from Hello.txt to test.gz");
        int c;
        while((c = in.read()) != -1)
            out.write(c);       //写压缩文件 writing compressing file
        in.close();
        out.close();

        System.out.println("reading file form test.gz to monitor");

        // InputStreamReader 是面向字节与面向字符的桥梁
        BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));

        String s;
        while((s = in2.readLine()) != null)
            System.out.println(s);
        GZIPInputStream in3 = new GZIPInputStream(new FileInputStream("test.gz"));
        FileOutputStream out2 = new FileOutputStream("newHello.txt");
        while(( c = in3.read()) != 1)
            out2.write(c);
        in3.close();
        out2.close();
    }
}
