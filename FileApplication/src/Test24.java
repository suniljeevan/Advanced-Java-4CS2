//creating a folder 4CS2
import java.io.*;
import java.util.Scanner;
public class Test24
{
public static void main(String arr[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter folder name");
String foldername=sc.next();
File f=new File("C:\\"+foldername);
if(f.exists())
System.out.println("already exist");
else if(f.mkdir()==true)
System.out.println("successfully created");
else
System.out.println("cannot be created");
}
}
