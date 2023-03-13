//create 3 threads to print factorials of 3 different numbers
class FactThread extends Thread {
	String name;
	int number;
	long fact=1;
	FactThread(String name,int number) {
		this.name=name;
		this.number=number;
		System.out.println(name + " thread started");
	}
	public void run() {
		try {
		for(int i=1;i<=number;i++) {
 			System.out.println(name + " is executing");
            fact=fact*i;	
            Thread.sleep(2000);
            }
		}catch(Exception e) {}
		System.out.println(name +" factorial is "+fact);
	}
}
public class Test13 {
	public static void main(String[] args) throws Exception{
       FactThread t1=new FactThread("first",5);
       FactThread t2=new FactThread("second",6);
       FactThread t3=new FactThread("third",7);
       t1.start();t2.start();t3.start();
       t1.join();t2.join();t3.join();
       
	}

}
