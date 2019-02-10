
public class Vehicle {

	protected String brand;
	protected String model;
	protected int year;
	
	public void honk() {
		System.out.println("Honk: Beep! Beep!");
	}
	
	public void dataPrint() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
