//creating a binary file student.dat
//CA2
// 67,91,76,lcs02,118,86,104,97,105,0070,114,0062,0073,
import java.io.*;
import java.util.Scanner;
public class Test25 {
public static void main(String args[]) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.println("Enter file name");
String filename=sc.next();
FileOutputStream output = 
new FileOutputStream("C:\\4CS2\\"+filename+".dat");
System.out.println("file created");
String header ="Name   regdno    submitted?";
output.write(header.getBytes());
System.out.println("file written");
output.close();
}}







