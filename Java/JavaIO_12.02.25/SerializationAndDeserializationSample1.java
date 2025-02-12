import java.io.*;

public class SerializationAndDeserializationSample1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialization();

        deserialization();
    }

    public static void serialization() {
        try {
            Employee em = new Employee(987, "zyx", "zyx@sample.com");

            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(em);
            oos.flush();

            oos.close();
            System.out.println("Serialization success");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e);
        }
    }

    public static void deserialization() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
            Employee emp = (Employee) ois.readObject();

            System.out.println("Deserialized Employee: " + emp.Eno + " " + emp.Ename);

            ois.close();
        } catch (Exception e) {
            System.out.println("Deserialization error: " + e);
        }
    }

    static class Employee implements Serializable {
        int Eno;
        String Ename;
        transient String email;

        Employee(int Eno, String Ename, String email) {
            this.Eno = Eno;
            this.Ename = Ename;
            this.email = email;
        }
    }
}
