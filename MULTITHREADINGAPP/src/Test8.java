//creating a single thread using Runnable interface 
//Note Runnable creates a task , can be assigned to a Thread
class Task implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread() + "running");
		System.out.println("welcome");
	}
}
class Task2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread()+ " running");
		System.out.println("presidency");
	}
}
public class Test8 {
	public static void main(String[] args) throws Exception{
		System.out.println("Hi");
		Task task = new Task();
		Thread t1 = new Thread(task);
		Task2 task2 = new Task2();
		Thread t2 = new Thread(task2);
		t1.setName("firstchild");
		t1.start();
		t2.start();
		t2.setName("secondchild");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread()+ " running");
		System.out.println("bye");
	}

}











