class Sphere {
	private double radious =5.6;
	
	public void vol_sphere() {
		System.out.println("volume is "+4.0/3*3.141*radious*radious*radious);
	}
}
class Cylinder {
	
	private double radious =5.6,height=3.4;
	public void vol_cylinder() {
		System.out.println("volume is "+3.141*radious*radious*height);
	}
}
public class Test2 {

	public static void main(String[] args) {
		Sphere s=new Sphere();
		Cylinder c=new Cylinder();
		s.vol_sphere();
		c.vol_cylinder();

	}

}


