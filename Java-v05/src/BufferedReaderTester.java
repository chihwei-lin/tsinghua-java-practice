import java.io.*;

public class BufferedReaderTester {
    public static void main(String[] args) {
        String fileName = "Hello.txt", line;
        try{
            BufferedReader in = new BufferedReader(new FileReader( fileName ));
            line = in.readLine();       // 读取一行
            while(line!=null){
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        }catch (IOException iox){
            System.out.println("Problem reading " + fileName);
        }
    }
}
