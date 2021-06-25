import java.io.*;

public class Main {
    public static void main(String[] args) {
        Demo object = new Demo(25, "Jasper");
        String filename = "abc.txt";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
        } catch(IOException ex) {
            print(ex);
        }

        Demo object2 = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object2 = (Demo)in.readObject();
            in.close();
            file.close();
            print(object2.a);
            print(object2.b);

        } catch (IOException ex) {
            print(ex);
        } catch (ClassNotFoundException ex) {
            print(ex);
        }
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }

}
