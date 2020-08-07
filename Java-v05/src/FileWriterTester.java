import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester {
    public static void main(String[] args) throws IOException {
        try{
            String fileName = "Hello.txt";
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("Hello!\n");
            writer.write("This is my first text file,!\n");
            writer.write("You can see how this is done.!\n");
            writer.write("输入中文也可以!\n");
            writer.close();
        }catch (IOException iox){
            System.out.println("Problem writing: "+iox);
        }
    }
}
