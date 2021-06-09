import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * An ObjectOutputStream writes primitive data types of Java objects to an OutputStream.
         * The Objects can be read using an ObjectInputStream.
         * Persistent storage of objects can be accomplished by using a file for the stream.
         */
        A a = new A(20, "Test");
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A b = (A)ois.readObject();
        System.out.println(b.i + " " + b.s);
        oos.close();
        ois.close();
    }
}
