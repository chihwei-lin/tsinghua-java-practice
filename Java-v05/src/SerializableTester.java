import java.io.*;

class Book implements Serializable {        // 可被序列化
    int id;
    String name;
    String author;
    float price;
    public Book(int id, String name, String author, float price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
}

public class SerializableTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book book = new Book(1000, "Java Programming Skills", "Wang Sir", 30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
        oos.writeObject(book);
        oos.close();

        book = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));

        // 数据读取进来是 Object 类，因此必须要有文档记录读取的对象是属于什么类
        // 才能做转换
        book = (Book)ois.readObject();

        ois.close();

        System.out.println("ID is: "+book.id);
        System.out.println("name is: "+book.name);
        System.out.println("author is: "+book.author);
        System.out.println("price is: "+book.price);
    }
}
