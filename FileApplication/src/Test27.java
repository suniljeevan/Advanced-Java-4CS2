//student is seralizable
import java.io.Serializable;
import java.io.*;
class Studentt implements Serializable {
int regdno;
String name;
double cgpa;
public Studentt(int regdno, String name, double cgpa) {
	this.regdno = regdno;
	this.name = name;
	this.cgpa = cgpa;
}

}
public class Test27 {
	public static void main(String[] args) throws Exception{
       Studentt ob1=new Studentt(123,"fayaz1",7.5);
       Studentt ob2=new Studentt(124,"fayaz2",7.5);
       Studentt ob3=new Studentt(125,"fayaz3",7.5);
       Studentt ob4=new Studentt(126,"fayaz4",7.5);
       Studentt ob5=new Studentt(127,"fayaz5",7.5);
       Studentt ob6=new Studentt(128,"fayaz6",7.5);
       Studentt ob7=new Studentt(129,"fayaz7",7.5);
       Studentt ob8=new Studentt(130,"fayaz8",7.5);
       Studentt ob9=new Studentt(131,"fayaz9",7.5);
       Studentt ob10=new Studentt(132,"fayaz10",7.5);
 FileOutputStream fileOut =
		 new FileOutputStream("C:\\sunil\\CS2_student.ser");
       ObjectOutputStream out = new ObjectOutputStream(fileOut);
       out.writeObject(ob1);
       out.writeObject(ob2);
       out.writeObject(ob3);
       out.writeObject(ob4);
       out.writeObject(ob5);
       out.writeObject(ob6);
       out.writeObject(ob7);
       out.writeObject(ob8);
       out.writeObject(ob9);
       out.writeObject(ob10);
       out.close();
       fileOut.close();
       System.out.println
       ("Serialized data is saved in /sunil/cs2student.ser");

	}

}
