
public class Main {
	
	public static void main(String[] args) {
		
		Operation o = new Operation();
		
//		int x = 10;
//		o.swap(x);
//		
//		System.out.println(x);
		
		Value value = new Value();
		value.v = 10;
		
		o.swapValue(value);
		
		System.out.println(value.v);
	}
}
