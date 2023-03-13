////print numbers 5 to 1  three times using Runnable
class PrintTask implements Runnable {
	public void run() {
		try {
			for(int i=5;i>=1;i--) {
				System.out.println(Thread.currentThread()+" "+i);
				Thread.sleep(5000);
			}
		}catch(Exception e) {}
	}
}
public class Test12 {
	public static void main(String[] args) throws Exception{
	  PrintTask task=new PrintTask();
	  Thread t1=new Thread(task);
	  Thread t2=new Thread(task);
	  Thread t3=new Thread(task);
	  t1.start();
	  t2.start();
	  t3.start();
	  t1.setName("first");
	  t2.setName("second");
	  t3.setName("third");
	  t1.join();
	  t2.join();
	  t3.join();
	  System.out.println("main ends");
	}

}
