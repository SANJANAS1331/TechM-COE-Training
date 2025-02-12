import java.io.*;

public class SerializationAndDeserializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialization();

        deserialization();
    }

    public static void serialization() {
        try {
            Student s1 = new Student(211, "Ravi");

            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();

            out.close();
            System.out.println("Serialization success");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e);
        }
    }

    public static void deserialization() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s = (Student) in.readObject();

            System.out.println("Deserialized Student: " + s.rno + " " + s.name);

            in.close();
        } catch (Exception e) {
            System.out.println("Deserialization error: " + e);
        }
    }

    static class Student implements Serializable {
        int rno;
        String name;

        Student(int rno, String name) {
            this.rno = rno;
            this.name = name;
        }
    }
}
