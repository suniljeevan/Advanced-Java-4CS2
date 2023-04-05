import java.io.*;
public class Test18 {
	public static void main(String[] args) {
        File ob = new File("C:\\ankit");
       if( ob.exists()==true)
        System.out.println("folder exists");
       else 
    	   System.out.println("folder does not exist"); 
       System.out.println("path: "+ob.getAbsolutePath());
       System.out.println("parent: "+ob.getParent());
	}

}
