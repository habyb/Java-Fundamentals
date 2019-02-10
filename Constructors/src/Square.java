
public class Square {

	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	public double calculateArea() {
		return side * side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}
