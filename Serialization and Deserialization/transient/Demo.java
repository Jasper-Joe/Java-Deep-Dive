import java.io.*;
import java.util.Date;

public class Demo implements Serializable {
    int i = 10, j = 20;
    transient int k = 30;
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;

    public static void main(String[] args) throws Exception{
        Demo input = new Demo();
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo output = (Demo)ois.readObject();
        print(output.i); // 10
        print(output.j); // 20
        print(output.k); // 0 because of transient
        print(output.l); // 40
        print(output.m); // 50


    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
