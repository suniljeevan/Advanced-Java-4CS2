//create 2 threads to do 1) print even numbers 1 to 100
// 2) to print prime numbers 1 to 100
class PrimeThread extends Thread {
	String name;
	PrimeThread(String name) {
		this.name=name;
		System.out.println(name+" thread started");
	}
	public void run() {
		int count;
		try {
		for(int n=2;n<=100;n++) {
			count=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0)count++;
			}
			if(count==1)
				System.out.println(n+" is prime");
			Thread.sleep(5000);
		}
		}catch(Exception e) {}
	}
}
class EvenThread extends Thread {
	String name;
	EvenThread(String name) {
		this.name=name;
		System.out.println(name+" thread started");
	}
	public void run() {
		try {
		for(int n=1;n<=100;n++) {
			if(n%2==0)
				System.out.println(n+" is even");
			Thread.sleep(10000);
		}}catch(Exception e) {}
	}
}

public class Test14 {
	public static void main(String[] args) throws Exception{
     PrimeThread t1=new PrimeThread("first");
     EvenThread t2=new EvenThread("second");
     t1.start();t2.start();
     t1.join();t2.join();
	}
}





