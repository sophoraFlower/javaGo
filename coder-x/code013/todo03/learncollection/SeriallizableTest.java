package code013.todo03.learncollection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}

public class SeriallizableTest {

    public static void main(String[] args) {
        // 序列化对象
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in employee.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }
    }

}
