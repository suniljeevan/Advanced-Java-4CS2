//synchronization
class Resource {
	String str;
synchronized public void setString(String s) {
		str=s;
		try {
          System.out.print("[");
          Thread.sleep(2000);
          System.out.print(str+"]");
		}catch(Exception e) {}
	}
}
class UtilizeResource extends Thread {
	String name;
	Resource r;
	UtilizeResource(String name,Resource r) {
		this.name=name;
		this.r=r;
		System.out.println(name +" thread created");
	}
   public void run() {	
	   r.setString(name);
   }
}

public class Test15 {
	public static void main(String[] args) throws Exception{
		Resource r=new Resource();
       UtilizeResource t1=new UtilizeResource("first",r);
       UtilizeResource t2=new UtilizeResource("second",r);
       UtilizeResource t3=new UtilizeResource("third",r);
       t1.start();t2.start();t3.start();
       t1.join();t2.join();t3.join();
	}

}
