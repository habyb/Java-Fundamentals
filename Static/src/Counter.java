
public class Counter {

	public static int value;
	
	static {
		value = 1;
	}

	public static void increase() {
		value++;
	}

	public static int getValue() {
		return value;
	}
}
