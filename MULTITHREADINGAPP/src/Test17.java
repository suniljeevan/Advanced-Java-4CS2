import java.util.Random;
//1 producer 2 consumer
class buffer {
	int number;
	boolean isgenerated = false;
	synchronized void getSquare() {
		System.out.println(number*number);
	}
	synchronized void getCube() {
		System.out.println(number*number*number);
	}
}
class Producer extends Thread {
	String name;
	buffer b;
	Producer(String name, buffer b) {
		this.name=name;
		this.b=b;
	}
	public void run() {
		try {
			if(b.isgenerated==true)wait();
			Random r=new Random();
	         int number=r.nextInt()%100;
	         b.number=number;
	         b.isgenerated=true;
	         notify();
		}catch(Exception e) {}
	}
}
public class Test17 {
	public static void main(String[] args) {
         Random r=new Random();
         int number=r.nextInt()%100;
         System.out.println(number);
	}

}
