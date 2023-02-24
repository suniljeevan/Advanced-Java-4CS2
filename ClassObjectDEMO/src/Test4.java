abstract class shape_123 {
	public abstract void area();
}
class circle_123 extends shape_123 {
	double radious=4.5;
	public void area() {
		System.out.println("circle area is "+3.14*radious*radious);
	}
}
class sphere_123 extends shape_123 {
	double radious=4.5;
	public void area() {
		System.out.println("sphere area is "+4*3.14*radious*radious);
	}
}
class cylinder_123 extends shape_123 {
	double radious=4.5,height=3.5;
	public void area() {
		System.out.println("cylinder area is "+2*3.14*radious*height+2*3.14*radious*radious);
	}
}
public class Test4 {

	public static void main(String[] args) {
		shape_123 s=new circle_123();
		s.area();
		s=new sphere_123();
		s.area();
		s=new cylinder_123();
		s.area();

	}

}
