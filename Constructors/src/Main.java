
public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		double area1 = r1.calculateArea();
		System.out.println(area1);
		
		Rectangle r2 = new Rectangle(5, 7);
		double area2 = r2.calculateArea();
		System.out.println(area2);
		
		Square s = new Square(6);
		System.out.println(s.calculateArea());
	}

}
