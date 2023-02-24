class Circle {
	private int x=3,y=4;
	private double radious =5.6;
	public void circumference() {
		System.out.println("circumference is "+2*3.141*radious);
	}
	public void area() {
		System.out.println("area is "+3.141*radiuous*radious);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Circle acircle=new Circle();
		Circle bcircle=new Circle();
		acircle.circumference();
		bcircle.area();

	}

}
