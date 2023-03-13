//it creates two threads to print 1 t0 5
// total 3 thread (main, one, two)
class MyThread extends Thread {
	String name;
	MyThread(String threadname) {
		name=threadname;
		System.out.println(name + " thread created");
	}
	public void run()  { 
		try {
		for(int i=1;i<=5;i++) {
		System.out.println(name+" "+i);
		Thread.sleep(1000);
		}
		}catch(Exception e) {}
		
	}
}
public class SingleThreadTest {

	public static void main(String[] args) throws Exception{
		System.out.println("Main thread begins");
		System.out.println("hello");	
        //context switch to thread one
		MyThread m1=new MyThread("One");
		MyThread m2=new MyThread("two");
		MyThread m3=new MyThread("three");
		MyThread m4=new MyThread("four");
		MyThread m5=new MyThread("five");
		m1.start();
		m2.start();m3.start();m4.start();m5.start();
		Thread.sleep(5000);
        System.out.println("bye");
	}

}
