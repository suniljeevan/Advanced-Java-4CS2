import java.io.*;
import java.io.Serializable;
class Student implements Serializable {
private static final long serialVersionUID = 1234567L;
public String name;
public String regdno;
public double cgpa;
}
public class Test27_SerializeDemo {
public static void main(String [] args) throws Exception {
Student s = new Student();
s.name = "sanjay";
s.regdno = "20213cse0123";
s.cgpa = 7.5;
FileOutputStream fileOut =new FileOutputStream("C:\\sunil\\student.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(s);
out.close();
fileOut.close();
System.out.printf("Serialized data is saved in /tmp/student.ser");
}
}
