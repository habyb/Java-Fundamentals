
public class Main {

	public static void main(String[] args) {
		
		Mathematics m = new Mathematics();
		
		int sum = m.sum(10, 20);
		System.out.println(sum);
		
		double sum2 = m.sum(10.0, 20); // Value 20 (implicit casting): int to double
		System.out.println(sum2);
	}

}
