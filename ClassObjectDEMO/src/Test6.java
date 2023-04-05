//program on unchecked exception (not serious)
//ex (ArithmeticException, nullpointer,Arrayindexoutofbounds)
public class Test6 {
	public static void main(String[] args) {
		System.out.println("program begins"); 
		int x=5;
		int y=0;
		int z=x/y;      //run time mistake
        System.out.println("end of the program");		

	}

}
