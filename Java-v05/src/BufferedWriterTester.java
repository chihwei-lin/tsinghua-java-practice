import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTester {
    public static void main(String[] args) throws IOException {
        String fileName = "Hello.txt";
        FileWriter writer = new FileWriter(fileName, true);
        BufferedWriter out = new BufferedWriter(writer);
        out.write("Hello!");
        out.newLine();

        out.write("This is my first text file,!");
        out.newLine();

        out.write("You can see how this is done.!");
        out.newLine();

        out.write("输入中文也可以!");
        out.newLine();

        out.close();
    }
}
