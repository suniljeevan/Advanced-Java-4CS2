//create a thread using Thread, give a name using
//parameterized constructor
//print welcome and presidency
class mynewth extends Thread {
	String name;
	mynewth(String n) {
		name=n;
	}
	public void run() {
		try {
	System.out.println(name+ " running");	
    System.out.println("welcome");
    Thread.sleep(1000);
    System.out.println("presidency");
	}catch(Exception e) {}
	}
}

public class Test10 {
	public static void main(String[] args) throws Exception{
		System.out.println("hi");
		mynewth t1=new mynewth("first");
		t1.start();
		mynewth t2=new mynewth("second");
		t2.start();
		mynewth t3=new mynewth("third");
		t3.start();
		mynewth t4=new mynewth("fourth");
		t4.start();
		mynewth t5=new mynewth("fifth");
		t5.start();
		Thread.sleep(10000);
		System.out.println("bye");

	}

}
