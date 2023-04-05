import java.io.*;
public class Test28 {
public static void main(String [] args) throws Exception {
Studentt ob[]=new Studentt[10];
FileInputStream fileIn = 
new FileInputStream("C:\\sunil\\cs2_student.ser");
ObjectInputStream in = new ObjectInputStream(fileIn);
for(int i=0;i<10;i++)
ob[i] = (Studentt) in.readObject();
in.close();
fileIn.close();
System.out.println("Deserialized Student...");
for(int i=0;i<10;i++) {
System.out.println("Name: " + ob[i].name);
System.out.println("Regd no: " + ob[i].regdno);
System.out.println("CGPA: " + ob[i].cgpa);
}
}
}
