import java.util.Scanner;
//Create a class Room, Create 3 objects of Room with different 
//height and width
class Room {
	int height,width;
	public Room() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height & width");
		height=sc.nextInt();
		width=sc.nextInt();
	}
	void print() {
		System.out.println("height "+height);
		System.out.println("width "+width);
	}
}
public class Test3 {
	public static void main(String[] args) {
		Room lfl1=new Room();
		Room lfl2=new Room();
		Room lfl3=new Room();
       lfl3.print();
	}

}
