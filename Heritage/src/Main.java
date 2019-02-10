
public class Main {

	public static void main(String[] args) {
		
		System.out.println("CAR");
		Car c = new Car();
		c.setBrand("XYZ");
		c.setModel("ABC");
		c.setYear(2000);
		c.setFourDoors(true);
		c.dataPrint();
		c.honk();
		
		System.out.println();
		
		System.out.println("MOTORCYCLE");
		Motorcycle m = new Motorcycle();
		m.setBrand("QQQ");
		m.setModel("ZZZ");
		m.setYear(2010);
		m.dataPrint();
		m.fly();
		m.honk();
		
		System.out.println();
		
		System.out.println("TRUCK");
		Truck tk = new Truck();
		tk.honk();
	}

}
