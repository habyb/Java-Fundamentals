
public class Application {

	public static void main(String[] args) {
		
		long l = 10; // implicit casting
//		long l = 10L;
		
		double d = 30; // implicit casting
		
//		float f = 40.0; // Type mismatch: cannot convert from double to float
//		float f = 40F;
		float f = (float) 40.0; // explicit casting
		
//		short s = 100;
//		short s = 100000; // Type mismatch: cannot convert from int to short
		short s = (short) 100000; // Result = -31072
		
//		byte b = 110;
//		byte b = 130; // Type mismatch: cannot convert from int to byte
		byte b = (byte) 130; // Result = -126
		
		System.out.println(b);
	}
}
