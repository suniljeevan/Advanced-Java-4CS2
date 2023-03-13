//print numbers 5 to 1  three times using Thread
class printThread extends Thread {
	String name;
	printThread(String name) {
		this.name=name;
	}
	public void run() {
		try {
			for(int i=5;i>=1;i--) {
				System.out.println(name+" "+i);
				Thread.sleep(5000);
			}
		}catch(Exception e) {}
	}
}
public class Test11 {
	public static void main(String[] args)throws Exception {
		printThread t1=new printThread("first");
		printThread t2=new printThread("second");
		printThread t3=new printThread("third");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("alive ?");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		t1.join();
		t2.join();
		t3.join();
		System.out.println("alive ?");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println("main ends");

	}

}
