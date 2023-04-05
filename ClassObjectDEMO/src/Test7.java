//program on checked exception ( serious)
//ex (FileNotFoundException, InterruptedException,SQLException)
//for checked exception try-catch is mandatory
//throws is an alternate solution for try-catch
//ignoring exception
public class Test7 {
	public static void main(String[] args) throws Exception {
 
		System.out.println("Prgram begins");
		//throw new ArithmeticException("Division by zero");
		throw new InterruptedException("Thread Interruption");
		
		}

	}


