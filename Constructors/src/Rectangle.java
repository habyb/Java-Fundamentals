
public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {
		this(4, 3);
		//width = 4;
		//height = 3;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return width * height;
	}
}
