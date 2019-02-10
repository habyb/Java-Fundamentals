
public class Car extends Vehicle {

	private boolean fourDoors;

	public boolean isQuatroPortas() {
		return fourDoors;
	}

	public void setFourDoors(boolean fourDoors) {
		this.fourDoors = fourDoors;
	}
	
	@Override
	public void dataPrint() {
		super.dataPrint();
		System.out.println("Four doors: " + fourDoors);
	}
}
