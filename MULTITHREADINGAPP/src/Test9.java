//creating a thread by extending Thread
class MyTh extends Thread {
	public void run() {
		System.out.println(Thread.currentThread() + " running");
		System.out.println("welcome");
	}
}
public class Test9 {
	public static void main(String[] args) throws Exception {
      System.out.println("hi");
      MyTh t1=new MyTh();
      t1.setName("First");
      t1.start();
      Thread.sleep(5000);
      System.out.println("bye");
	}

}
