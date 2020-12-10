import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
            Student student = new Student(1,"Kay","131 side",18);
            oos.writeObject(student);
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            oos.close();
        }

        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("student.txt"));
            Student student =
        }
    }
}
